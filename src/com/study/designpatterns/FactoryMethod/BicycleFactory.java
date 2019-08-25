package com.study.designpatterns.FactoryMethod;

public class BicycleFactory implements Factory{

    @Override
    public Vehicle produce(){
        return new Bicycle();
    }
}
