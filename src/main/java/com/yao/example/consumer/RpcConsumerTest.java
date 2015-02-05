package com.yao.example.consumer;

import com.yao.client.RpcProxy;
import com.yao.client.ServiceDiscovery;
import com.yao.example.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 15-2-5.
 */
public class RpcConsumerTest {
    public static void main(String[]args){
        //监听服务注册
       /* ServiceDiscovery serviceDiscovery=new ServiceDiscovery("127.0.0.1:2181");
        new Thread(serviceDiscovery);
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        ApplicationContext context= new ClassPathXmlApplicationContext("classpath*:spring/spring-consumer-context.xml");
        RpcProxy rpcProxy=context.getBean(RpcProxy.class);
        //RpcProxy rpcProxy=new RpcProxy("127.0.0.1:8111",serviceDiscovery);
        HelloService helloService= rpcProxy.create(HelloService.class);
        String result= helloService.hello("yao robin");
        System.out.println(result);
    }
}
