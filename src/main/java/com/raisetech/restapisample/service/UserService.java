package com.raisetech.restapisample.service;

import com.raisetech.restapisample.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    List<User> findUsersByName(String name);

    User findById(int id);

    void saveUser(String name, LocalDate birthdate, String address);

    void deleteUser(int id);

}
