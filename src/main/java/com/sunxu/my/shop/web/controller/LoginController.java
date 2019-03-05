package com.sunxu.my.shop.web.controller;

import com.sunxu.my.shop.commons.context.SpringContext;
import com.sunxu.my.shop.entity.User;
import com.sunxu.my.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈登录控制层〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public class LoginController extends HttpServlet {
    private UserService userService = (UserService) SpringContext.context.getBean("userService");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User admin = userService.login("sunxu@qq.com","sunxu");
        System.out.println(admin);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
