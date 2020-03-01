package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.Trainings;

public class TrainingResponse {
    private boolean success;
    private Trainings data;
    private Errors errors;

    public TrainingResponse(boolean success, Trainings data, Errors errors) {
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

    public Trainings getData() {
        return data;
    }

    public void setData(Trainings data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
