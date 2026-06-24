package tw.nekomimi.nekogram.tlv;

import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

import java.util.Collection;
import java.util.Map;

public final class JsonUtils {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void add(JsonObject obj, String key, Object value) {
        obj.add(key, toJsonElement(value));
    }

    public static JsonElement toJsonElement(Object value) {
        switch (value) {
            case null -> {
                return JsonNull.INSTANCE;
            }
            case JsonElement element -> {
                return element;
            }
            case Boolean b -> {
                return GSON.toJsonTree(b);
            }
            case Number n -> {
                return GSON.toJsonTree(n);
            }
            case String s -> {
                return GSON.toJsonTree(s);
            }
            case byte[] bytes -> {
                return GSON.toJsonTree(Base64.encodeToString(bytes, Base64.NO_WRAP));
            }
            case Collection<?> collection -> {
                var array = new JsonArray();
                for (var item : collection) {
                    array.add(toJsonElement(item));
                }
                return array;
            }
            case Object[] array -> {
                var jsonArray = new JsonArray();
                for (var item : array) {
                    jsonArray.add(toJsonElement(item));
                }
                return jsonArray;
            }
            case Map<?, ?> map -> {
                var obj = new JsonObject();
                for (var entry : map.entrySet()) {
                    obj.add(String.valueOf(entry.getKey()), toJsonElement(entry.getValue()));
                }
                return obj;
            }
            default -> {
                return GSON.toJsonTree(value);
            }
        }
    }

    public static String toJsonString(JsonElement element) {
        return GSON.toJson(element);
    }
}