package com.example.ukmku.model;

public class SourceOfIncome {

    private String _id, source_of_income;

    public SourceOfIncome(String _id, String source_of_income) {
        this._id = _id;
        this.source_of_income = source_of_income;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSource_of_income() {
        return source_of_income;
    }

    public void setSource_of_income(String source_of_income) {
        this.source_of_income = source_of_income;
    }

}
