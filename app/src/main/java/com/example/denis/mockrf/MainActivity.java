package com.example.denis.mockrf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private static ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        NetworkBuilder.init("https://api.myjson.com/");
        apiService = NetworkBuilder.getService();

        requestApi();


    }

    public void requestApi() {

        apiService.getData().enqueue(new Callback<LoginInputModel>() {
            @Override
            public void onResponse(Call<LoginInputModel> call, Response<LoginInputModel> response) {

                Log.d("!!!!", response.body().getToken());

            }

            @Override
            public void onFailure(Call<LoginInputModel> call, Throwable t) {

                Log.d("!!!!", "fail");

            }
        });
    }

    }
