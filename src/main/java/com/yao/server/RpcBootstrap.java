package com.yao.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by root on 15-2-5.
 */
public class RpcBootstrap {

    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(1);

        System.out.println("start rpc Server");
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:config/configure.properties");
        //test----

        RpcServer rpcServer=context.getBean(RpcServer.class);
        System.out.println(rpcServer);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
