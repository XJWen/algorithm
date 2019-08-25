package com.study.designpatterns.FactoryMethod;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("汽车行驶");
    }
}
