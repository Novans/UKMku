package com.example.ukmku.model;

import java.sql.Timestamp;

public class User {
    private String _id, id, name, email, password, status;
    private Timestamp created_at, updated_at;

    public User(String _id, String id, String name, String email, String password, String status, Timestamp created_at, Timestamp updated_at) {
        this._id = _id;
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
