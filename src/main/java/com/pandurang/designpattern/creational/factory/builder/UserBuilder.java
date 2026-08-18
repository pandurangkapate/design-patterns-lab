package com.pandurang.designpattern.creational.factory.builder;

public class UserBuilder {

    private String name;
    private String email;
    private int age;
    private String city;
    private String country;
    private boolean active;

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder country(String country) {
        this.country = country;
        return this;
    }

    public UserBuilder active(boolean active) {
        this.active = active;
        return this;
    }

    public User build() {
        return new User(
                name,
                email,
                age,
                city,
                country,
                active
        );
    }
}