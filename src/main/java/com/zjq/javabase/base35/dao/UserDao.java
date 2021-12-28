package com.zjq.javabase.base35.dao;

import com.zjq.javabase.base35.domain.User;

import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {


    public List<User> findAll();
}
