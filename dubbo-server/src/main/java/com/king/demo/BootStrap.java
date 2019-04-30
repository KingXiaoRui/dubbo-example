package com.king.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author DKing
 * @description
 * @date 2019/4/30
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-server.xml");
        context.start();

        System.in.read();
    }

}
