package com.example.springbootmybatisdemo.service.impl;

import com.example.springbootmybatisdemo.entity.User;
import com.example.springbootmybatisdemo.mapper.UserMapper;
import com.example.springbootmybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
