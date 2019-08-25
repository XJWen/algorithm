package com.study.designpatterns.strategy;

public class NoFly implements FlyBehvior{
    @Override
    public void fly() {
        System.out.println("……not Fly……");
    }
}
