package com.yao.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 15-2-5.
 */
public class RpcBootstrap {
    public static void main(String[]args){
        new ClassPathXmlApplicationContext("classpath*:config/configure.properties");
    }
}
