package com.example.ukmku.model;

import android.media.Image;

public class Report {

    private String _id, user_id, image_path;
    private Long value;
    private Image image;

    public Report(String _id, String user_id, String image_path, Long value, Image image) {
        this._id = _id;
        this.user_id = user_id;
        this.image_path = image_path;
        this.value = value;
        this.image = image;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
