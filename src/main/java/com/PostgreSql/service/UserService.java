package com.PostgreSql.service;

import com.PostgreSql.entity.User;

import java.util.List;

public interface UserService {

//    create
    User createUser(User user);

    List<User> getAllUser();
}
