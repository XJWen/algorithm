package com.study.designpatterns.strategy;

public abstract class Duck {

    FlyBehvior flyBehvior;
    QuackBehvior quackBehvior;

    public Duck(){

    }

    public void Quack(){
       quackBehvior.Quack();
    }

    public abstract void display();

    public void Swim(){
        System.out.println("……can swim……");
    }

    public void fly(){
        flyBehvior.fly();
    }
}
