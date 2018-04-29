package io.faob.utopian.http;

import io.faob.utopian.http.handlers.ErrorHandler;
import io.faob.utopian.http.handlers.ResponseHandler;
import io.faob.utopian.type.TypeMapper;
import okhttp3.*;

import java.io.IOException;

public class HttpManagerImpl<T> implements HttpManager<T> {
    private Request request;
    private TypeMapper<T> typeMapper;
    private OkHttpClient okHttpClient = new OkHttpClient();

    public HttpManagerImpl(String url, TypeMapper<T> typeMapper) {
        this.typeMapper = typeMapper;

        String apiKey = System.getProperty("API_KEY");
        if (apiKey == null)
            apiKey = "";

        String apiKeyId = System.getProperty("API_KEY_ID");
        if (apiKeyId == null)
            apiKeyId = "";

        this.request = new Request
                .Builder()
                .header("x-api-key", apiKey)
                .header("x-api-key-id", apiKeyId)
                .header("Content-Type", "application/json")
                .url(url)
                .build();
    }

    @Override
    public T get() throws Exception {
        Response response = okHttpClient.newCall(request).execute();
        return typeMapper.map(response.body().string());
    }

    @Override
    public void getAsync(ResponseHandler<T> responseHandler, ErrorHandler<Exception> errorHandler) {
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                errorHandler.handleError(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    String jsonString = response.body().string();
                    responseHandler.handleResponse(typeMapper.map(jsonString));
                } catch (Exception e) {
                    errorHandler.handleError(e);
                }
            }
        });
    }
}
