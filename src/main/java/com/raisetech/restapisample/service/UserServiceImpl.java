package com.raisetech.restapisample.service;

import com.raisetech.restapisample.entity.User;
import com.raisetech.restapisample.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAll();
    }

    @Override
    public List<User> findUsersByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public void saveUser(String name, LocalDate birthdate, String address) {
        userMapper.save(name, birthdate, address);
    }

    @Override
    public void deleteUser(int id) {
        userMapper.delete(id);
    }
}
