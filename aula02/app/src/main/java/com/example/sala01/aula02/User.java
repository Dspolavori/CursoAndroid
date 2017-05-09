package com.example.sala01.aula02;

/**
 * Created by sala01 on 09/05/2017.
 */

public class User {
    String name;
    String description;

    public User() {
    }

    public User(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
