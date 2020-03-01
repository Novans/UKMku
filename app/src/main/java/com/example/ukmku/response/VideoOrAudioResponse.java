package com.example.ukmku.response;

import com.example.ukmku.model.Errors;

public class VideoOrAudioResponse {
    private boolean success;
    private Errors errors;

    public VideoOrAudioResponse(boolean success, Errors errors) {
        this.success = success;
        this.errors = errors;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
