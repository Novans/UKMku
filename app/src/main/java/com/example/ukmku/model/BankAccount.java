package com.example.ukmku.model;

public class BankAccount {

    private String _id, bank_name, account_num;

    public BankAccount(String _id, String bank_name, String account_num) {
        this._id = _id;
        this.bank_name = bank_name;
        this.account_num = account_num;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAccount_num() {
        return account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

}
