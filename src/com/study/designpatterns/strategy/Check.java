package com.study.designpatterns.strategy;

public class Check {

    public static void main(String[] args){
        Duck greenHeadDuck = new GreenHeadDuck();
        Duck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Quack();
        greenHeadDuck.fly();

        redHeadDuck.display();
        redHeadDuck.Quack();
        redHeadDuck.fly();
        redHeadDuck.Swim();
    }
}
