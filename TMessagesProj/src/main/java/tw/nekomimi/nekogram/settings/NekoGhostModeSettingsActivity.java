package tw.nekomimi.nekogram.settings;

import android.view.View;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

import java.util.ArrayList;

import tw.nekomimi.nekogram.NekoConfig;

public class NekoGhostModeSettingsActivity extends BaseNekoSettingsActivity {

    private final int hideOnlineStatusRow = rowId++;
    private final int secretlyReadMessagesRow = rowId++;
    private final int hideTypingStatusRow = rowId++;
    private final int hideStoryViewsRow = rowId++;

    @Override
    protected void fillItems(ArrayList<UItem> items, UniversalAdapter adapter) {
        items.add(UItem.asCheck(hideOnlineStatusRow, LocaleController.getString(R.string.HideOnlineStatus), LocaleController.getString(R.string.HideOnlineStatusAbout)).slug("hideOnlineStatus").setChecked(NekoConfig.hideOnlineStatus));
        items.add(UItem.asCheck(secretlyReadMessagesRow, LocaleController.getString(R.string.SecretlyReadMessages), LocaleController.getString(R.string.SecretlyReadMessagesAbout)).slug("secretlyReadMessages").setChecked(NekoConfig.secretlyReadMessages));
        items.add(UItem.asCheck(hideTypingStatusRow, LocaleController.getString(R.string.HideTypingStatus), LocaleController.getString(R.string.HideTypingStatusAbout)).slug("hideTypingStatus").setChecked(NekoConfig.hideTypingStatus));
        items.add(UItem.asCheck(hideStoryViewsRow, LocaleController.getString(R.string.HideStoryViews), LocaleController.getString(R.string.HideStoryViewsAbout)).slug("hideStoryViews").setChecked(NekoConfig.hideStoryViews));
        items.add(UItem.asShadow(null));
    }

    @Override
    protected void onItemClick(UItem item, View view, int position, float x, float y) {
        var id = item.id;
        if (id == hideOnlineStatusRow) {
            NekoConfig.toggleHideOnlineStatus();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(NekoConfig.hideOnlineStatus);
            }
        } else if (id == secretlyReadMessagesRow) {
            NekoConfig.toggleSecretlyReadMessages();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(NekoConfig.secretlyReadMessages);
            }
        } else if (id == hideTypingStatusRow) {
            NekoConfig.toggleHideTypingStatus();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(NekoConfig.hideTypingStatus);
            }
        } else if (id == hideStoryViewsRow) {
            NekoConfig.toggleHideStoryViews();
            if (view instanceof TextCheckCell) {
                ((TextCheckCell) view).setChecked(NekoConfig.hideStoryViews);
            }
        }
    }

    @Override
    protected String getActionBarTitle() {
        return LocaleController.getString(R.string.GhostMode);
    }

    @Override
    protected String getKey() {
        return "ghost";
    }
}
