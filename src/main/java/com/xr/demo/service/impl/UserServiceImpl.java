package com.xr.demo.service.impl;

import com.xr.demo.dao.UserMapper;
import com.xr.demo.model.User;
import com.xr.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryAll() {

        return userMapper.queryAll();
    }
}
