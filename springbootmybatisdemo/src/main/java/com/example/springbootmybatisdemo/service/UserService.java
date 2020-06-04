package com.example.springbootmybatisdemo.service;

import com.example.springbootmybatisdemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
