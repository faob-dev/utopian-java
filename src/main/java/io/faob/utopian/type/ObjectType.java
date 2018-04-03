package io.faob.utopian.type;

import com.google.gson.JsonObject;
import io.faob.utopian.http.HttpManager;
import io.faob.utopian.http.HttpManagerImpl;

/**
 * To convert json object response to custom object types
 *
 * @author FaoB
 */
public class ObjectType<T> extends Type {
    private TypeMapper<JsonObject> asJsonObject;
    private TypeMapper<T> asObject;

    public ObjectType(String url, TypeMapper<JsonObject> asJsonObject, TypeMapper<T> asObject) {
        super(url);
        this.asJsonObject = asJsonObject;
        this.asObject = asObject;
    }

    /**
     * Call to this method will return response as {@link JsonObject}.
     * <p>
     * Note: After this method call you need to call {@code get()} or {@code getAsync()}
     * to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    public HttpManager<JsonObject> asJsonObject() {
        return new HttpManagerImpl<>(url, asJsonObject);
    }

    /**
     * Call to this method will map string response to java type and return that type.
     * <p>
     * Note: After this method call you need to call {@code get()} or {@code getAsync()}
     * to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */
    public HttpManager<T> asJavaType() {
        return new HttpManagerImpl<>(url, asObject);
    }
}