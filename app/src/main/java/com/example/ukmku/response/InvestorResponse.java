package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Investor;

public class InvestorResponse {
    private boolean success;
    private Investor data;
    private Errors errors;

    public InvestorResponse(boolean success, Investor data, Errors errors) {
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

    public Investor getData() {
        return data;
    }

    public void setData(Investor data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
