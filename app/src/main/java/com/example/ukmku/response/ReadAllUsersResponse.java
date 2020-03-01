package com.example.ukmku.response;

import com.example.ukmku.model.User;

public class ReadAllUsersResponse {
    private boolean success;
    private User data;

    public ReadAllUsersResponse(boolean success, User data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
