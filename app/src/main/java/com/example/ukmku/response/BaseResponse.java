package com.example.ukmku.response;

import com.example.ukmku.model.Data;
import com.example.ukmku.model.Errors;

public class BaseResponse {
    private boolean success;
    private Data data;
    private Errors errors;

    public BaseResponse(boolean success, Data data, Errors errors) {
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
