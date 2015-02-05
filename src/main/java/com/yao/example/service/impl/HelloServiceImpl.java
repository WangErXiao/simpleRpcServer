package com.yao.example.service.impl;

import com.yao.example.service.HelloService;
import com.yao.share.annotation.RpcService;

/**
 * Created by root on 15-2-5.
 */
@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String word) {
        System.out.println(word);

        return "reply to consumer:"+word;
    }
}
