package com.example.ukmku.model;

public class Errors {
    private Data data;
    private Email email;
    private Password password;

    public Errors(Data data, Email email, Password password) {
        this.data = data;
        this.email = email;
        this.password = password;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
