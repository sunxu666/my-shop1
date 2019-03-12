package com.sunxu.my.shop.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br>
 * 〈首页〉
 *
 * @author sunxu
 * @create 2019/3/12
 * @since 1.0.0
 */
public class MainController {

    /**
     * 成功跳转首页
     * @return
     */
    @RequestMapping(value = "main",method = RequestMethod.GET)
    public String main(){
        return "main";
    }
}
