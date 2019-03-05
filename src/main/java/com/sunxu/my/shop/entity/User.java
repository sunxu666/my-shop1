package com.sunxu.my.shop.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户〉
 * 后台使用的是用户，前台使用的是会员
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
