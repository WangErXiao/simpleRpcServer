package com.yao.example.consumer;

import com.yao.client.RpcProxy;
import com.yao.example.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 15-2-5.
 */
public class RpcConsumerTest {
    public static void main(String[]args){
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:spring/spring-consumer-context.xml");
        RpcProxy rpcProxy=context.getBean(RpcProxy.class);
        HelloService helloService= rpcProxy.create(HelloService.class);
        String result= helloService.hello("yao robin");
        System.out.println(result);
    }
}
