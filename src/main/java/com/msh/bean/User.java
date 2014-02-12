package com.msh.bean;


public class User {
    private String name;
    private String email;
    private String phone;
    private Profile profile;

    public User(){};

    public User(String name, String email, String phone, Profile profile) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Profile getProfile() {
        return profile;
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profile=" + profile +
                '}';
    }
}
