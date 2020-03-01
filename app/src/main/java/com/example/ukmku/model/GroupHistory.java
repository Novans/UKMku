package com.example.ukmku.model;

import java.sql.Timestamp;
import java.util.Date;

public class GroupHistory {

    private String _id, group_id;
    private Float profit;
    private Long value;
    private Date date;
    private Timestamp created_at, updated_at;

    public GroupHistory(String _id, String group_id, Float profit, Timestamp created_at, Timestamp updated_at) {
        this._id = _id;
        this.group_id = group_id;
        this.profit = profit;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
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
