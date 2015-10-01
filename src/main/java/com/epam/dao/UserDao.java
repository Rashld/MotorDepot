package com.epam.dao;

import com.epam.entity.User;

import java.util.Map;

/**
 * Created by Rashid on 01.10.2015.
 */
public class UserDao {
    Map<String,User> users;

    public UserDao(Map<String, User> users) {
        this.users = users;
    }
}
