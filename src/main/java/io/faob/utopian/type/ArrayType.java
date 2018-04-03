package io.faob.utopian.type;

import com.google.gson.JsonArray;
import io.faob.utopian.http.HttpManager;
import io.faob.utopian.http.HttpManagerImpl;

import java.util.List;

/**
 * To convert json array response to custom array types
 *
 * @author FaoB
 */
public class ArrayType<T> extends Type {
    private TypeMapper<T> asJsonArray;

    public ArrayType(String url, TypeMapper<T> asJsonArray) {
        super(url);
        this.asJsonArray = asJsonArray;
    }

    /**
     * Call to this method will return response as {@link JsonArray}.
     * <p>
     * Note: After this method call you need to call {@code get()} or {@code getAsync()}
     * to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */

    public HttpManager<T> asJsonArray() {
        return new HttpManagerImpl<>(url, asJsonArray);
    }

}