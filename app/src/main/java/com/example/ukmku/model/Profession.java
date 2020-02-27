package com.example.ukmku.model;

public class Profession {

    private String _id, profession;

    public Profession(String _id, String profession) {
        this._id = _id;
        this.profession = profession;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
