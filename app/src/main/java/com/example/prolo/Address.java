package com.example.prolo;

import java.io.Serializable;

public class Address implements Serializable {
    private String street;
    private String city;
    private String prov_stat;
    private String country;
    private String pCode;

    private String address;

    public Address(String street, String city, String prov_stat, String country, String pCode){
        this.street = street;
        this.city = city;
        this.prov_stat = prov_stat;
        this.country = country;
        this.pCode = pCode;

    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProv_stat() {
        return prov_stat;
    }

    public String getCountry() {
        return country;
    }

    public String getpCode() {
        return pCode;
    }

}
