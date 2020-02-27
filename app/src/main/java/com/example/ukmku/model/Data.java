package com.example.ukmku.model;

public class Data {
    private User user;
    private ApiToken api_token;
    private String message;

    public Data(User user, ApiToken api_token, String message) {
        this.user = user;
        this.api_token = api_token;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ApiToken getApi_token() {
        return api_token;
    }

    public void setApi_token(ApiToken api_token) {
        this.api_token = api_token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
