package com.example.ukmku.model;

import java.util.Date;

public class TTL {

    private String location;
    private Date birthdate;

    public TTL(String location, Date birthdate) {
        this.location = location;
        this.birthdate = birthdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

}
