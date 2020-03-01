package com.example.ukmku.model;

import java.util.Date;

public class Owner {
    private String _id, user_id, npwp, business_name, business_type, director_name, bank_account;
    private Date birthdate;
    private Address address;
    private Long assets;

    public Owner(String _id, String user_id, String npwp, String business_name, String business_type, String director_name, String bank_account, Date birthdate, Address address, Long assets) {
        this._id = _id;
        this.user_id = user_id;
        this.npwp = npwp;
        this.business_name = business_name;
        this.business_type = business_type;
        this.director_name = director_name;
        this.bank_account = bank_account;
        this.birthdate = birthdate;
        this.address = address;
        this.assets = assets;
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

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getAssets() {
        return assets;
    }

    public void setAssets(Long assets) {
        this.assets = assets;
    }
    
}
