package com.study.designpatterns.strategy;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        flyBehvior = new NoFly();
        quackBehvior = new GagaQuack();
    }

    @Override
    public void display() {
        System.out.println("……Red Head……");
    }
}
