package tw.nekomimi.nekogram.tlv;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

import java.util.Map;
import java.util.function.Function;

public class TlBinaryReader {

    private final SerializedData data;
    private final Map<Integer, Function<TlBinaryReader, JsonObject>> readers = TlReaders.READERS;

    public TlBinaryReader(SerializedData data) {
        this.data = data;
        //noinspection ConstantValue
        if (TLRPC.LAYER != TlReaders.LAYER) {
            throw new IllegalStateException("TlReaders layer mismatch: expected " + TlReaders.LAYER + ", got " + TLRPC.LAYER);
        }
    }

    public int readInt() {
        return data.readInt32(true);
    }

    public long readLong() {
        return data.readInt64(true);
    }

    public float readFloat() {
        return data.readFloat(true);
    }

    public double readDouble() {
        return data.readDouble(true);
    }

    public boolean readBoolean() {
        return data.readBool(true);
    }

    public byte[] readBytes() {
        return data.readByteArray(true);
    }

    public String readString() {
        return data.readString(true);
    }

    public JsonElement readObject() {
        return readObject(readInt());
    }

    public JsonElement readObject(int constructor) {
        if (constructor == Vector.constructor) {
            return readBareVector(TlBinaryReader::readObject);
        }

        if (constructor == TLRPC.TL_boolTrue.constructor) {
            return JsonUtils.toJsonElement(true);
        }

        if (constructor == TLRPC.TL_boolFalse.constructor) {
            return JsonUtils.toJsonElement(false);
        }

        if (constructor == TLRPC.TL_null.constructor) {
            return JsonUtils.toJsonElement(null);
        }

        var reader = readers.get(constructor);
        if (reader == null) {
            throw new IllegalStateException("Unknown constructor: 0x" + Integer.toUnsignedString(constructor, 16));
        }

        return reader.apply(this);
    }

    public JsonArray readVector(
            Function<TlBinaryReader, ?> reader
    ) {
        var constructor = readInt();

        if (constructor != Vector.constructor) {
            throw new IllegalStateException("Expected Vector constructor, got 0x" + Integer.toUnsignedString(constructor, 16));
        }

        return readBareVector(reader);
    }

    public JsonArray readBareVector(Function<TlBinaryReader, ?> reader) {
        var count = readInt();

        var result = new JsonArray();

        for (var i = 0; i < count; i++) {
            result.add(JsonUtils.toJsonElement(reader.apply(this)));
        }

        return result;
    }
}