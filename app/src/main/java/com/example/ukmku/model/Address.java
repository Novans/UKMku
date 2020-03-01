package com.example.ukmku.model;

public class Address {

    private String phone_number, postal_code, address;
    private Integer rt, rw, id_kab_kota, id_prov;

    public Address(String phone_number, String postal_code, String address, Integer rt, Integer rw, Integer id_kab_kota, Integer id_prov) {
        this.phone_number = phone_number;
        this.postal_code = postal_code;
        this.address = address;
        this.rt = rt;
        this.rw = rw;
        this.id_kab_kota = id_kab_kota;
        this.id_prov = id_prov;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRt() {
        return rt;
    }

    public void setRt(Integer rt) {
        this.rt = rt;
    }

    public Integer getRw() {
        return rw;
    }

    public void setRw(Integer rw) {
        this.rw = rw;
    }

    public Integer getId_kab_kota() {
        return id_kab_kota;
    }

    public void setId_kab_kota(Integer id_kab_kota) {
        this.id_kab_kota = id_kab_kota;
    }

    public Integer getId_prov() {
        return id_prov;
    }

    public void setId_prov(Integer id_prov) {
        this.id_prov = id_prov;
    }

}
