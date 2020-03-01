package com.example.ukmku.model;

public class Investor {

    private String _id, user_id, gender, phone_number, religion, id_number, address;
    private TTL ttl;
    private ETC etc;

    public Investor(String _id, String user_id, String gender, String phone_number, String religion, String id_number, String address, TTL ttl, ETC etc) {
        this._id = _id;
        this.user_id = user_id;
        this.gender = gender;
        this.phone_number = phone_number;
        this.religion = religion;
        this.id_number = id_number;
        this.address = address;
        this.ttl = ttl;
        this.etc = etc;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TTL getTtl() {
        return ttl;
    }

    public void setTtl(TTL ttl) {
        this.ttl = ttl;
    }

    public ETC getEtc() {
        return etc;
    }

    public void setEtc(ETC etc) {
        this.etc = etc;
    }

}
