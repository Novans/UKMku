package com.example.ukmku.model;

public class BusinessType {

    private String _id, business_type;

    public BusinessType(String _id, String business_type) {
        this._id = _id;
        this.business_type = business_type;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

}
