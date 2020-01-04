package com.xr.demo.dao;

import com.xr.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> queryAll();
}
