package com.chuang.test;

import com.chuang.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chuang
 * @date 2020/04/13 - 20:00
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-application.xml");
        AccountService as = (AccountService) ac.getBean("accountService");

        as.doSevice();
    }
}