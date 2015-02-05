package com.yao;

import java.util.HashMap;

/**
 * Created by root on 15-2-5.
 */
public class Test01<K,V> {

    public<K,V> void test(){
        HashMap<K,V> hashMap=new HashMap<K, V>();
    }
    public static void main(String[]args){
        HashMap<?,?> map=new HashMap<Object, Object>();
    }
}
