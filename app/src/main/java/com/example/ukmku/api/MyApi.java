package com.example.ukmku.api;

import com.example.ukmku.model.Login;
import com.example.ukmku.model.Register;
import com.example.ukmku.response.BaseResponse;
import com.example.ukmku.response.LoginResponse;
import com.example.ukmku.response.ReligionResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MyApi {

    //USER
    //Register
    @POST("/register")
    Call<BaseResponse> register(@Body Register user);

    @POST("/login")
    Call<LoginResponse> login(@Body Login login);

    @GET("/religion")
    Call<ReligionResponse> getReligion();
}
