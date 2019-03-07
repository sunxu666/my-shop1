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

    private UserService userService = SpringContext.getBean("userService");
    //private UserService userService = SpringContext.getBean(UserServiceImpl.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //UserService userService = (UserService) SpringContext.getBean("userService");
        User admin = userService.login("sunxu@qq.com", "sunxu");
        System.out.println(admin);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        SpringContext context = new SpringContext();
       // UserService userService = (UserService) context.getBean("userService");
        User admin = userService.login(email, password);
        //admin不为空时，登录成功
        if (admin != null) {
            //分发到index.jsp ,跳转
            //req.getRequestDispatcher("/index.jsp").forward(req, resp);
            //重定向
            resp.sendRedirect("/main.jsp");
        }
        //admin为空时，登录失败
        else {
            req.setAttribute("message","用户名或密码错误");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
