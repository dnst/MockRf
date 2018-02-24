package com.example.denis.mockrf;

import android.util.Log;

import io.appflate.restmock.RESTMockServer;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by denis on 24.02.18.
 */

public class NetworkBuilder {

    private static String url;
    private static Retrofit retrofit;

    public NetworkBuilder(String url) {
        this.url = url;
    }

    public static void init(String url) {
        retrofit = new Retrofit.Builder()
                .baseUrl(RESTMockServer.getUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d("!!!!", RESTMockServer.getUrl());
    }

    public static ApiService getService() {
        return retrofit.create(ApiService.class);
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }
}
