package com.msh.bean;


public class Profile {
    private String city;
    private String street;

    Profile() {};

    public Profile(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
