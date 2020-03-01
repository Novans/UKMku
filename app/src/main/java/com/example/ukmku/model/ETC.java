package com.example.ukmku.model;

public class ETC {

    private String profession_id, education_id, income_id, source_of_income_id, mariage_status;

    public ETC(String profession_id, String education_id, String income_id, String source_of_income_id, String mariage_status) {
        this.profession_id = profession_id;
        this.education_id = education_id;
        this.income_id = income_id;
        this.source_of_income_id = source_of_income_id;
        this.mariage_status = mariage_status;
    }

    public String getProfession_id() {
        return profession_id;
    }

    public void setProfession_id(String profession_id) {
        this.profession_id = profession_id;
    }

    public String getEducation_id() {
        return education_id;
    }

    public void setEducation_id(String education_id) {
        this.education_id = education_id;
    }

    public String getIncome_id() {
        return income_id;
    }

    public void setIncome_id(String income_id) {
        this.income_id = income_id;
    }

    public String getSource_of_income_id() {
        return source_of_income_id;
    }

    public void setSource_of_income_id(String source_of_income_id) {
        this.source_of_income_id = source_of_income_id;
    }

    public String getMariage_status() {
        return mariage_status;
    }

    public void setMariage_status(String mariage_status) {
        this.mariage_status = mariage_status;
    }

}
