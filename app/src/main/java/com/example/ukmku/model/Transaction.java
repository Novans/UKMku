package com.example.ukmku.model;

public class Transaction {

    private String _id, user_id, group_id, category, sell_buy_id, payment_type;
    private Long amount;
    private Buy transaction;
    private BankTransfer bank_transfer;

    public Transaction(String _id, String user_id, String group_id, String category, String sell_buy_id, String payment_type, Long amount, Buy transaction, BankTransfer bank_transfer) {
        this._id = _id;
        this.user_id = user_id;
        this.group_id = group_id;
        this.category = category;
        this.sell_buy_id = sell_buy_id;
        this.payment_type = payment_type;
        this.amount = amount;
        this.transaction = transaction;
        this.bank_transfer = bank_transfer;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public BankTransfer getBank_transfer() {
        return bank_transfer;
    }

    public void setBank_transfer(BankTransfer bank_transfer) {
        this.bank_transfer = bank_transfer;
    }

    public Buy getTransaction() {
        return transaction;
    }

    public void setTransaction(Buy transaction) {
        this.transaction = transaction;
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

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSell_buy_id() {
        return sell_buy_id;
    }

    public void setSell_buy_id(String sell_buy_id) {
        this.sell_buy_id = sell_buy_id;
    }

}
