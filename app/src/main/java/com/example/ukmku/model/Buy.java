package com.example.ukmku.model;

public class Buy {

    private String _id, transaction_id;
    private Integer nilai_order;

    public Buy(String _id, String transaction_id, Integer nilai_order) {
        this._id = _id;
        this.transaction_id = transaction_id;
        this.nilai_order = nilai_order;
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

    public Integer getNilai_order() {
        return nilai_order;
    }

    public void setNilai_order(Integer nilai_order) {
        this.nilai_order = nilai_order;
    }

}
