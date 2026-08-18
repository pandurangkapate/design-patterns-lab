package com.pandurang.designpattern.creational.factory.builder;

public class User {

    private final String name;
    private final String email;
    private final int age;
    private final String city;
    private final String country;
    private final boolean active;

    User(String name,
         String email,
         int age,
         String city,
         String country,
         boolean active) {

        this.name = name;
        this.email = email;
        this.age = age;
        this.city = city;
        this.country = country;
        this.active = active;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public boolean isActive() {
        return active;
    }
}