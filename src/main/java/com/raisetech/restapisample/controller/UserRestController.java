package com.raisetech.restapisample.controller;

import com.raisetech.restapisample.entity.User;
import com.raisetech.restapisample.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class UserRestController {

    UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users/{id}")
    public ResponseEntity<User> usersByName(@PathVariable int id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("/api/users")
    public ResponseEntity<String> createUser(@RequestBody UserForm userForm) {
        userService.saveUser(userForm.getName(), userForm.getBirthdate(), userForm.getAddress());
        return ResponseEntity.created(URI.create("/api/users")).build();
    }

    @DeleteMapping("/api/users/{id}")
    public ResponseEntity deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/api/users")
    public ResponseEntity<String> updateUser(@RequestBody UserForm userForm) {
        return ResponseEntity.ok("仮の実装です");
    }

}
