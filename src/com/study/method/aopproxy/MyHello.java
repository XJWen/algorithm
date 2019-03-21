package com.study.method.aopproxy;

public class MyHello implements IHello{
    @Override
    public void sayHello(String str) {
        System.out.println("Hello"+str);
    }
}
