package com.example.ukmku.model;

public class Education {

    private String _id, education;

    public Education(String _id, String education) {
        this._id = _id;
        this.education = education;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
