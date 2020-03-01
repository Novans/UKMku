package com.example.ukmku.model;

import java.net.URL;

public class Trainings {
    private String _id, title;
    private URL url;

    public Trainings(String _id, String title, URL url) {
        this._id = _id;
        this.title = title;
        this.url = url;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
