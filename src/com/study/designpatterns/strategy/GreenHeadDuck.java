package com.study.designpatterns.strategy;

public class GreenHeadDuck extends Duck{

    public GreenHeadDuck(){
        flyBehvior = new CanFly();
        quackBehvior = new GegeQuack();
    }

    @Override
    public void display() {
        System.out.println("……Green Head……");
    }
}
