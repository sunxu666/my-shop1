package com.sunxu.my.shop.dao;

import com.sunxu.my.shop.entity.User;

/**
 * @Description:〈一句话功能简述〉<br>
 * @Auther: sunxu
 * @Date: 2019/3/5 17:37
 */
public interface UserDao {
    /**
     * 根据邮箱和密码获取用户信息
     * @param email
     * @param password
     * @return
     */
    public User getUserByEmailAndPassword(String email,String password);
}
