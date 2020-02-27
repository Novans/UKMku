package com.example.ukmku.model;

public class Income {

    private String _id;
    private Integer min, max;

    public Income(String _id, Integer min, Integer max) {
        this._id = _id;
        this.min = min;
        this.max = max;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

}
