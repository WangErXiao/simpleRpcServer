package com.yao.example.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 15-2-5.
 */
public class RpcProviderTest {
    public static void main(String[] args) {
        System.out.println("start rpc Server");
        new ClassPathXmlApplicationContext("classpath*:spring/spring-provider-context.xml");
    }
}
