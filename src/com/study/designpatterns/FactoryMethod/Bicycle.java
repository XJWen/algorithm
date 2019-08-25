package com.study.designpatterns.FactoryMethod;

public class Bicycle implements Vehicle{

    @Override
    public void run() {
        System.out.println("自行车行驶");
    }
}
