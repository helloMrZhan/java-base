package com.zjq.javabase.base32.test;

import com.zjq.javabase.base32.dao.UserDao;
import com.zjq.javabase.base32.domain.User;
import org.junit.Test;

/**
 * @author zjq
 */
public class UserDaoTest {



    @Test
    public void testLogin(){
        User loginuser = new User();
        loginuser.setUsername("zjq");
        loginuser.setPassword("zjq");


        UserDao dao = new UserDao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
