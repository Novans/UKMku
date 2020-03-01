package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Group;

public class GroupResponse {
    private boolean success;
    private Group data;
    private Errors errors;

    public GroupResponse(boolean success, Group data, Errors errors) {
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

    public Group getData() {
        return data;
    }

    public void setData(Group data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
