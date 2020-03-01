package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Transaction;
import com.example.ukmku.model.Transactions;

public class SellResponse {
    private boolean success;
    private Transactions data;
    private Errors errors;

    public SellResponse(boolean success, Transactions data, Errors errors) {
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

    public Transactions getData() {
        return data;
    }

    public void setData(Transactions data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
