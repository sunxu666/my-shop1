package com.sunxu.my.shop.dao.impl;

import com.sunxu.my.shop.dao.UserDao;
import com.sunxu.my.shop.entity.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * 〈一句话功能简述〉<br>
 * 〈实现数据层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public class UserDaoImpl implements UserDao {
    //加载日志
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    public User getUserByEmailAndPassword(String email, String password) {
        logger.debug("调用 getUser（），参数为：email:{} password:{}",email,password);
        User user = null;
        if ("sunxu@qq.com".equals(email)) {
            user = new User();
            user.setEmail("sunxu@qq.com");
            user.setUsername("sunxu");

            logger.info("成功获取 \"{}\" 的用户信息",user.getUsername());
        }else{
            logger.warn("获取\"{}\"的用户信息失败",user.getUsername());
        }

        return user;
    }
}
