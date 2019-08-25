package com.study.designpatterns.FactoryMethod;

public class CarFactory implements Factory{

    @Override
    public Vehicle produce(){
       return new Car();
    }
}
