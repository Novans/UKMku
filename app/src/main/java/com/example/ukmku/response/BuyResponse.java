package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Transaction;

public class BuyResponse {
    private boolean success;
    private Transaction data;
    private Errors errors;

    public BuyResponse(boolean success, Transaction data, Errors errors) {
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

    public Transaction getData() {
        return data;
    }

    public void setData(Transaction data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
