package com.example.ukmku.model;

public class DataRegister {
    private UserRegister user;

    private Api_Token apiToken;

    public UserRegister getUserRegister() {
        return user;
    }

    public void setUser(UserRegister user) {
        this.user = user;
    }

    public Api_Token getApiToken() {
        return apiToken;
    }

    public void setApiToken(Api_Token apiToken) {
        this.apiToken = apiToken;
    }
}
