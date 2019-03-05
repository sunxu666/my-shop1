package com.sunxu.my.shop.commons.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈这个工具类唯一一个作用获取bean〉
 *
 * @author sunxu
 * @create 2019/3/5
 * @since 1.0.0
 */
public class SpringContext {
    //获取spring-context.xml配置文件中的bean对象


    public static Object getBean(String beanId){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        return context.getBean(beanId);
    }
}
