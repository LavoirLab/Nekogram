package tw.nekomimi.nekogram.tlv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.JsonElement;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

import java.util.ArrayList;
import java.util.List;

import tw.nekomimi.nekogram.helpers.EntitiesHelper;
import tw.nekomimi.nekogram.settings.BaseNekoSettingsActivity;

public class JsonActivity extends BaseNekoSettingsActivity {

    private final JsonElement jsonElement;

    private final List<Node> allNodes = new ArrayList<>();
    private final List<Integer> visibleNodeIndexes = new ArrayList<>();

    public JsonActivity(JsonElement element) {
        jsonElement = element;
        visit(element, null, 0, false);
    }

    private void visit(JsonElement element, String key, int depth, boolean trailingComma) {
        if (element == null || element.isJsonNull()) {
            allNodes.add(new Node(depth, key, "null", Node.Type.VALUE_NULL, trailingComma));
            return;
        }

        if (element.isJsonPrimitive()) {
            var p = element.getAsJsonPrimitive();
            var type = p.isString() ? Node.Type.VALUE_STRING : p.isBoolean() ? Node.Type.VALUE_BOOLEAN : Node.Type.VALUE_NUMBER;
            allNodes.add(new Node(depth, key, p.getAsString(), type, trailingComma));
            return;
        }

        if (element.isJsonObject()) {
            var obj = element.getAsJsonObject();

            var start = new Node(
                    depth,
                    key,
                    null,
                    Node.Type.OBJECT_START,
                    trailingComma
            );
            start.element = element;
            start.collapsible = true;
            start.childCount = obj.size();

            allNodes.add(start);

            var iterator = obj.entrySet().iterator();
            while (iterator.hasNext()) {
                var entry = iterator.next();
                visit(entry.getValue(), entry.getKey(), depth + 1, iterator.hasNext());
            }

            var end = new Node(
                    depth,
                    null,
                    null,
                    Node.Type.OBJECT_END,
                    trailingComma
            );
            end.startNode = start;

            allNodes.add(end);

            return;
        }

        if (element.isJsonArray()) {
            var array = element.getAsJsonArray();

            var start = new Node(
                    depth,
                    key,
                    null,
                    Node.Type.ARRAY_START,
                    trailingComma
            );
            start.element = element;
            start.collapsible = true;
            start.childCount = array.size();

            allNodes.add(start);

            var size = array.size();
            for (var i = 0; i < size; i++) {
                visit(array.get(i), null, depth + 1, i < size - 1);
            }

            var end = new Node(
                    depth,
                    null,
                    null,
                    Node.Type.ARRAY_END,
                    trailingComma
            );
            end.startNode = start;

            allNodes.add(end);
        }
    }

    private void rebuildVisible() {
        visibleNodeIndexes.clear();
        var collapsedLevel = 0;

        for (var i = 0; i < allNodes.size(); i++) {
            var node = allNodes.get(i);

            var visible = collapsedLevel == 0;
            if ((node.type == Node.Type.OBJECT_END || node.type == Node.Type.ARRAY_END)
                    && node.startNode != null
                    && !node.startNode.expanded) {
                visible = false;
            }

            if (visible) {
                visibleNodeIndexes.add(i);
            }

            if (node.collapsible && !node.expanded) {
                collapsedLevel++;
            }

            if ((node.type == Node.Type.OBJECT_END || node.type == Node.Type.ARRAY_END)
                    && node.startNode != null
                    && node.startNode.collapsible
                    && !node.startNode.expanded) {
                collapsedLevel = Math.max(0, collapsedLevel - 1);
            }
        }
    }

    @Override
    public View createView(Context context) {
        var fragmentView = super.createView(context);

        var menu = actionBar.createMenu();
        var copyItem = menu.addItem(1, R.drawable.msg_copy);
        copyItem.setContentDescription(LocaleController.getString(R.string.ExportAsJson));
        copyItem.setOnClickListener(v -> {
            AndroidUtilities.addToClipboard(EntitiesHelper.warpInLanguageSpan(JsonUtils.toJsonString(jsonElement), "json"));
            BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
        });

        return fragmentView;
    }

    @Override
    protected void fillItems(ArrayList<UItem> items, UniversalAdapter adapter) {
        rebuildVisible();
        for (var index : visibleNodeIndexes) {
            items.add(JsonNodeViewFactory.of(index, allNodes.get(index)));
        }
    }

    @Override
    protected void onItemClick(UItem item, View view, int position, float x, float y) {
        var node = (Node) item.object;
        if (node.collapsible) {
            node.expanded = !node.expanded;
            listView.adapter.update(true);
        }
        if (node.startNode != null && node.startNode.collapsible) {
            node.startNode.expanded = !node.startNode.expanded;
            listView.adapter.update(true);
        }
    }

    @Override
    protected boolean onItemLongClick(UItem item, View view, int position, float x, float y) {
        var node = (Node) item.object;
        if (node.type == Node.Type.ARRAY_END || node.type == Node.Type.OBJECT_END) {
            return false;
        }
        ItemOptions.makeOptions(this, view)
                .setScrimViewBackground(listView.getClipBackground(view))
                .addIf(node.key != null, R.drawable.msg_copy, LocaleController.getString(R.string.JsonCopyKey), () -> {
                    AndroidUtilities.addToClipboard(node.key);
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
                })
                .add(R.drawable.msg_copy, LocaleController.getString(R.string.JsonCopyValue), () -> {
                    AndroidUtilities.addToClipboard(node.type == Node.Type.OBJECT_START || node.type == Node.Type.ARRAY_START ?
                            EntitiesHelper.warpInLanguageSpan(JsonUtils.toJsonString(node.element), "json") :
                            node.value);
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
                })
                .show();
        return true;
    }

    @Override
    protected String getActionBarTitle() {
        return LocaleController.getString(R.string.ViewAsJson);
    }

    public static class Node {
        public enum Type {
            OBJECT_START,
            OBJECT_END,
            ARRAY_START,
            ARRAY_END,
            VALUE_NULL,
            VALUE_NUMBER,
            VALUE_BOOLEAN,
            VALUE_STRING,
        }

        final int depth;
        final String key;
        final String value;
        final Type type;
        boolean trailingComma;

        JsonElement element;

        Node startNode;
        boolean collapsible;
        boolean expanded = true;

        int childCount;

        Node(int depth, String key, String value, Type type, boolean trailingComma) {
            this.depth = depth;
            this.key = key;
            this.value = value;
            this.type = type;
            this.trailingComma = trailingComma;
        }

        public int getColorKey() {
            return switch (this.type) {
                case VALUE_BOOLEAN -> Theme.key_code_constant;
                case VALUE_STRING -> Theme.key_code_string;
                case VALUE_NUMBER -> Theme.key_code_number;
                case VALUE_NULL -> Theme.key_code_keyword;
                default -> -1;
            };
        }
    }

    private static class JsonNodeViewFactory extends UItem.UItemFactory<JsonNodeView> {
        static {
            setup(new JsonNodeViewFactory());
        }

        @Override
        public JsonNodeView createView(Context context, RecyclerListView listView, int currentAccount, int classGuid, Theme.ResourcesProvider resourcesProvider) {
            return new JsonNodeView(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem item, boolean divider, UniversalAdapter adapter, UniversalRecyclerView listView) {
            var cell = (JsonNodeView) view;
            cell.setNode((Node) item.object);
        }

        public static UItem of(int id, Node node) {
            var item = UItem.ofFactory(JsonNodeViewFactory.class);
            item.id = id;
            item.object = node;
            return item;
        }
    }

    private static class JsonNodeView extends LinearLayout {

        private static final Paint guidePaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        static {
            guidePaint.setStyle(Paint.Style.STROKE);
            guidePaint.setStrokeWidth(AndroidUtilities.dp(1));
            guidePaint.setPathEffect(
                    new DashPathEffect(
                            new float[]{
                                    AndroidUtilities.dp(2),
                                    AndroidUtilities.dp(2)
                            },
                            0
                    )
            );
        }

        private Node node;
        private boolean expanded;

        private final TextView keyTextView;
        private final TextView valueTextView;
        private final Theme.ResourcesProvider resourcesProvider;

        public JsonNodeView(@NonNull Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;

            setOrientation(HORIZONTAL);
            setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            guidePaint.setColor(getThemedColor(Theme.key_code_comment));

            keyTextView = new TextView(context);
            keyTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
            keyTextView.setTypeface(Typeface.MONOSPACE);
            keyTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(keyTextView, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.TOP | Gravity.LEFT));

            valueTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider) {
                @Override
                public int overrideColor() {
                    return ColorUtils.setAlphaComponent(getThemedColor(Theme.key_code_string), 51);
                }
            };
            valueTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
            valueTextView.setTypeface(Typeface.MONOSPACE);
            valueTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(valueTextView, LayoutHelper.createLinear(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.TOP | Gravity.LEFT));
        }

        public void setNode(Node node) {
            if (node != this.node) {
                this.node = node;

                var indent = AndroidUtilities.dp(node.depth * 16);
                setPadding(indent + AndroidUtilities.dp(8), AndroidUtilities.dp(2), AndroidUtilities.dp(8), AndroidUtilities.dp(2));

                var keyText = node.key == null ? null : "\"" + node.key + "\": ";
                if (keyText == null) {
                    keyTextView.setVisibility(GONE);
                } else {
                    keyTextView.setVisibility(VISIBLE);
                    keyTextView.setText(keyText);
                }
            } else if (expanded == node.expanded) {
                return;
            }
            this.expanded = node.expanded;

            var valueText = new SpannableStringBuilder();
            switch (node.type) {
                case OBJECT_START:
                    valueText.append('{');
                    if (!node.expanded) {
                        valueText.append("...}");
                    }
                    break;
                case OBJECT_END:
                    valueText.append('}');
                    break;
                case ARRAY_START:
                    valueText.append('[');
                    if (!node.expanded) {
                        valueText.append("...]");
                    }
                    break;
                case ARRAY_END:
                    valueText.append(']');
                    break;
                default:
                    if (node.type == Node.Type.VALUE_STRING) {
                        valueText.append('"');
                    }
                    valueText.append(node.value);
                    if (node.type == Node.Type.VALUE_STRING) {
                        valueText.append('"');
                    }
            }
            if ("_".equals(node.key)) {
                valueText.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View widget) {
                        Browser.openUrl(getContext(), "https://schema.jppgr.am/layer/" + TLRPC.LAYER + "/" + node.value);
                    }

                    @Override
                    public void updateDrawState(@NonNull TextPaint ds) {
                    }
                }, 1, valueText.length() - 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            var colorKey = node.getColorKey();
            if (colorKey > 0) {
                valueText.setSpan(new ForegroundColorSpan(getThemedColor(colorKey)), 0, valueText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            var showTrailingComma = node.trailingComma &&
                    (node.type != Node.Type.OBJECT_START && node.type != Node.Type.ARRAY_START || !node.expanded);
            if (showTrailingComma) {
                valueText.append(",");
            }
            if (!node.expanded && node.childCount > 0) {
                var comment = " // " + LocaleController.formatPluralStringComma("items", node.childCount);
                valueText.append(comment);
                valueText.setSpan(new ForegroundColorSpan(getThemedColor(Theme.key_code_comment)), valueText.length() - comment.length(), valueText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            valueTextView.setText(valueText);

            invalidate();
        }

        @Override
        protected void dispatchDraw(@NonNull Canvas canvas) {
            if (node != null && node.depth > 0) {
                var bottom = getMeasuredHeight();
                for (var level = 0; level < node.depth; level++) {
                    var x = AndroidUtilities.dp(16 * level + 11);
                    canvas.drawLine(x, 0, x, bottom, guidePaint);
                }
            }
            super.dispatchDraw(canvas);
        }

        private int getThemedColor(int key) {
            return Theme.getColor(key, resourcesProvider);
        }

    }
}
