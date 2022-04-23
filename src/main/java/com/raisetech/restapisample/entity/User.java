package com.raisetech.restapisample.entity;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private int id;
    private String name;
    private LocalDate birthdate;
    private String address;

    public User(int id, String name, LocalDate birthdate, String address) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(birthdate, user.birthdate) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthdate, address);
    }
}
