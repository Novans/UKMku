package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.User;

public class UpdateUserResponse {
    private boolean success;
    private User data;
    private Errors errors;

    public UpdateUserResponse(boolean success, User data, Errors errors) {
        this.success = success;
        this.data = data;
        this.errors = errors;
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

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
