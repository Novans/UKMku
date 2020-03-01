package com.example.ukmku.model;

public class Training {

    private String _id, ext, path;

    public Training(String _id, String ext, String path) {
        this._id = _id;
        this.ext = ext;
        this.path = path;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
