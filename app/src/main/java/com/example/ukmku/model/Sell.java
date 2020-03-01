package com.example.ukmku.model;

public class Sell {

    private String _id, transaction_id, group_id;
    private Integer jumlah_unit;

    public Sell(String _id, String transaction_id, String group_id, Integer jumlah_unit) {
        this._id = _id;
        this.transaction_id = transaction_id;
        this.group_id = group_id;
        this.jumlah_unit = jumlah_unit;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getJumlah_unit() {
        return jumlah_unit;
    }

    public void setJumlah_unit(Integer jumlah_unit) {
        this.jumlah_unit = jumlah_unit;
    }

}
