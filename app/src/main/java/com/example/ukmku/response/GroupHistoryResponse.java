package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.GroupHistory;

public class GroupHistoryResponse {
    private boolean success;
    private GroupHistory data;
    private Errors errors;

    public GroupHistoryResponse(boolean success, GroupHistory data, Errors errors) {
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

    public GroupHistory getData() {
        return data;
    }

    public void setData(GroupHistory data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
