package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Owner;

public class OwnerResponse {
    private boolean success;
    private Owner data;
    private Errors errors;

    public OwnerResponse(boolean success, Owner data, Errors errors) {
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

    public Owner getData() {
        return data;
    }

    public void setData(Owner data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
