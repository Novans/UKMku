package com.example.ukmku.model;

public class Portofolio {

    private String _id, user_id;
    private Integer saving, profit;

    public Portofolio(String _id, String user_id, Integer saving, Integer profit) {
        this._id = _id;
        this.user_id = user_id;
        this.saving = saving;
        this.profit = profit;
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

    public Integer getSaving() {
        return saving;
    }

    public void setSaving(Integer saving) {
        this.saving = saving;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

}
