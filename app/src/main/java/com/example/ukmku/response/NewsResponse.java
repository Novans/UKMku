package com.example.ukmku.response;

import com.example.ukmku.model.Errors;
import com.example.ukmku.model.News;

import java.util.ArrayList;

public class NewsResponse {
    private boolean success;
    private ArrayList<News> data;
    private Errors errors;

    public NewsResponse(boolean success, ArrayList<News> data, Errors errors) {
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

    public ArrayList<News> getData() {
        return data;
    }

    public void setData(ArrayList<News> data) {
        this.data = data;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }
}
