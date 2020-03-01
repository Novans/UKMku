package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.ReportData;

public class ReportResponse {
    private boolean success;
    private ReportData data;
    private Errors errors;

    public ReportResponse(boolean success, ReportData data, Errors errors) {
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

    public ReportData getData() {
        return data;
    }

    public void setData(ReportData data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
