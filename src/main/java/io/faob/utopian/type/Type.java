package io.faob.utopian.type;

import io.faob.utopian.http.HttpManager;
import io.faob.utopian.http.HttpManagerImpl;

/**
 * Type classes used to convert string response to custom types
 *
 * @author FaoB
 */
public class Type {
    protected String url;

    public Type(String url) {
        this.url = url;
    }


    /**
     * Call to this method will return response as {@link String}.
     * <p>
     * Note: After this method call you need to call {@code get()} or {@code getAsync()}
     * to make http call and get response.
     * </p>
     *
     * @return A reference to {@code HttpManager} object to make http call.
     */

    public HttpManager<String> asString() {
        return new HttpManagerImpl<>(url, jsonString -> jsonString);
    }
}
