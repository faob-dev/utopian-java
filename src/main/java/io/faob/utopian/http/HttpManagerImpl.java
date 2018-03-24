package io.faob.utopian.http;

import io.faob.utopian.type.TypeMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpManagerImpl<T> implements HttpManager<T> {
    private String url;
    private TypeMapper<T> typeMapper;
    private OkHttpClient okHttpClient = new OkHttpClient();

    public HttpManagerImpl(String url, TypeMapper<T> typeMapper) {
        this.url = url;
        this.typeMapper = typeMapper;
    }

    @Override
    public T get() throws Exception {
        Request request = new Request.Builder().url(url).build();
        Response response = okHttpClient.newCall(request).execute();
        return typeMapper.map(response.body().string());
    }
}
