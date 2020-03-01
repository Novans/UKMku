package com.example.ukmku.model;

public class Errors {
    private Data data;
    private Email email;
    private String message;
    private Password password;
    private IdNumber id_number;
    private PhoneNumber phone_number;
    private BusinessName business_name;
    private Bank_Account bank_account;
    private Group_Id group_id;

    public Errors(Data data, Email email, String message, Password password, IdNumber id_number, PhoneNumber phone_number, BusinessName business_name, Bank_Account bank_account, Group_Id group_id) {
        this.data = data;
        this.email = email;
        this.message = message;
        this.password = password;
        this.id_number = id_number;
        this.phone_number = phone_number;
        this.business_name = business_name;
        this.bank_account = bank_account;
        this.group_id = group_id;
    }

    public Group_Id getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Group_Id group_id) {
        this.group_id = group_id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public IdNumber getId_number() {
        return id_number;
    }

    public void setId_number(IdNumber id_number) {
        this.id_number = id_number;
    }

    public PhoneNumber getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(PhoneNumber phone_number) {
        this.phone_number = phone_number;
    }

    public BusinessName getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(BusinessName business_name) {
        this.business_name = business_name;
    }

    public Bank_Account getBank_account() {
        return bank_account;
    }

    public void setBank_account(Bank_Account bank_account) {
        this.bank_account = bank_account;
    }
}
