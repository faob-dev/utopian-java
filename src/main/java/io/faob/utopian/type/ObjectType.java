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
    private TypeMapper<T> asJsonObject;

    public ObjectType(String url, TypeMapper<T> asJsonObject) {
        super(url);
        this.asJsonObject = asJsonObject;
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

    public HttpManager<T> asJsonObject() {
        return new HttpManagerImpl<>(url, asJsonObject);
    }

}