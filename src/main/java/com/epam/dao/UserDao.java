package com.epam.dao;

import com.epam.entity.User;

import java.util.Map;

public class UserDao {
    Map<String,User> users;

    public UserDao(Map<String, User> users) {
        this.users = users;
    }
}
