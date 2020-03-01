package com.example.ukmku.response;

import com.example.ukmku.model.BusinessType;

public class BusinessTypeResponse {
    private boolean success;
    private BusinessType data;

    public BusinessTypeResponse(boolean success, BusinessType data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public BusinessType getData() {
        return data;
    }
}
