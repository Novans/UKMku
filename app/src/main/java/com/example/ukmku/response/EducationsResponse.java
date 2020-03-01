package com.example.ukmku.response;

import com.example.ukmku.model.Education;

public class EducationsResponse {
    private boolean success;
    private Education data;

    public EducationsResponse(boolean success, Education data) {
        this.success = success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public Education getData() {
        return data;
    }
}
