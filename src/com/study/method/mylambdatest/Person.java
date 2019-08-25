package com.study.method.mylambdatest;

import java.util.Optional;

public class Person {

    private String name;
    private int age;
    private Optional<String> email;
    private Optional<Integer> phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<Integer> getPhone() {
        return phone;
    }

    public void setPhone(Optional<Integer> phone) {
        this.phone = phone;
    }
}
