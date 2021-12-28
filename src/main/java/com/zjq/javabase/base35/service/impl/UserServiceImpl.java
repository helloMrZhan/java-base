package com.zjq.javabase.base35.service.impl;

import com.zjq.javabase.base35.dao.UserDao;
import com.zjq.javabase.base35.dao.impl.UserDaoImpl;
import com.zjq.javabase.base35.domain.User;
import com.zjq.javabase.base35.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
