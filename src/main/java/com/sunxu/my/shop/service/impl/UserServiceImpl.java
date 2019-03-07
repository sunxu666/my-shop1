package com.sunxu.my.shop.service.impl;

import com.sunxu.my.shop.commons.context.SpringContext;
import com.sunxu.my.shop.dao.UserDao;
import com.sunxu.my.shop.entity.User;
import com.sunxu.my.shop.service.UserService;

/**
 * 〈一句话功能简述〉<br>
 * 〈实现业务层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = SpringContext.getBean("userDao");
    public User login(String email, String password) {
       // UserDao userDao = (UserDao) SpringContext.getBean("userDao");
        return userDao.getUserByEmailAndPassword(email,password);
    }
}
