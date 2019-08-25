package com.study.designpatterns.FactoryMethod;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("公共汽车行驶");
    }
}
