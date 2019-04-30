package com.king.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DKing
 * @description
 * @date 2019/4/30
 */
public class ClientService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();

        IDKHello idkHello = (IDKHello) context.getBean("dkHello");
        System.out.println(idkHello.sayHello());
    }
}
