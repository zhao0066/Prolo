package com.example.prolo;

import java.io.Serializable;

public class Row implements Serializable {
    private String companyName;
    private String contact_name;
    private Address address;
    private String phone;
    private String email;
    private String website;
    private String gmap;
    private String product;
    private int id;


    public Row(String companyName, String contact_name, Address address, String phone, String email, String website, String gmap, String product, int id) {
        this.companyName = companyName;
        this.contact_name = contact_name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.website = website;
        this.gmap = gmap;
        this.product = product;
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public String getContact_name() {
        return contact_name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getGmap() {
        return gmap;
    }

    public String getProduct() {
        return product;
    }
}
