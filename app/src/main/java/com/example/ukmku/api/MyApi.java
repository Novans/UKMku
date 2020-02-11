package com.example.ukmku.api;

import com.example.ukmku.model.Login;
import com.example.ukmku.model.Register;
import com.example.ukmku.response.BaseResponse;
import com.example.ukmku.response.LoginResponse;
import com.example.ukmku.response.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyApi {

    //USER
    //Register
    @POST("login")
    Call<LoginResponse> login (@Body Login login);

    //Login
    @POST("register")
    Call<RegisterResponse> register (@Body Register register);
}
