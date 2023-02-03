package com.PostgreSql.controller;

import com.PostgreSql.entity.User;
import com.PostgreSql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
         return ResponseEntity.status(HttpStatus.CREATED).body(this.service.createUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUSer(){
        return ResponseEntity.ok().body(this.service.getAllUser());
    }
}
