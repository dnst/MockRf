package com.example.denis.mockrf;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by denis on 24.02.18.
 */

public interface ApiService {
    @Headers("Content-Type: application/json")
    @GET("/bins/4n2xe")
    Call<LoginInputModel> getData(); //@Query("name") String resourceName, @Query("num") int count);

}
