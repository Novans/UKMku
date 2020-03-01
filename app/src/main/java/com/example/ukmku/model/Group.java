package com.example.ukmku.model;

import java.util.Date;

public class Group {

    private String _id, name, category, business_type_id;
    private Integer price;
    private Float rating;
    private Date release_date;
    private Long assets;
    private Double profit_per_annual;
    private Profit profit;

    public Group(String _id, String name, String category, String business_type_id, Integer price, Float rating, Date release_date, Long assets, Double profit_per_annual, Profit profit) {
        this._id = _id;
        this.name = name;
        this.category = category;
        this.business_type_id = business_type_id;
        this.price = price;
        this.rating = rating;
        this.release_date = release_date;
        this.assets = assets;
        this.profit_per_annual = profit_per_annual;
        this.profit = profit;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBusiness_type_id() {
        return business_type_id;
    }

    public void setBusiness_type_id(String business_type_id) {
        this.business_type_id = business_type_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Long getAssets() {
        return assets;
    }

    public void setAssets(Long assets) {
        this.assets = assets;
    }

    public Double getProfit_per_annual() {
        return profit_per_annual;
    }

    public void setProfit_per_annual(Double profit_per_annual) {
        this.profit_per_annual = profit_per_annual;
    }

    public Profit getProfit() {
        return profit;
    }

    public void setProfit(Profit profit) {
        this.profit = profit;
    }
}
