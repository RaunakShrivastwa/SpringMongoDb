package com.PostgreSql.impl;

import com.PostgreSql.entity.User;
import com.PostgreSql.repositery.UserRepositery;
import com.PostgreSql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositery repositery;
    @Override
    public User createUser(User user) {
        user.setId(UUID.randomUUID().toString());
        return this.repositery.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return this.repositery.findAll();
    }
}
