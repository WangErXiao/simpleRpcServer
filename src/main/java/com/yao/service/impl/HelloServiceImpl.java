package com.yao.service.impl;

import com.yao.service.HelloService;
import com.yao.annotation.RpcService;

/**
 * Created by root on 15-2-5.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String word) {
        System.out.println(word);

        return word;
    }
}
