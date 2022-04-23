package com.raisetech.restapisample.controller;

import java.time.LocalDate;
import java.util.Objects;

public class UserForm {

    private String name;
    private LocalDate birthdate;
    private String address;

    public UserForm(String name, LocalDate birthdate, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
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
        UserForm userForm = (UserForm) o;
        return Objects.equals(name, userForm.name) && Objects.equals(birthdate, userForm.birthdate) && Objects.equals(address, userForm.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, address);
    }
}
