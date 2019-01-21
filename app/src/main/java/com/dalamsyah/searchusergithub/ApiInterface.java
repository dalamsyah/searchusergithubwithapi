package com.dalamsyah.searchusergithub;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("users")
    Call<Items> getUser(@Query("q") String key);

}
