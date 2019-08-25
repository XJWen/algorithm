package com.study.designpatterns.FactoryMethod;

public class BusFactory implements Factory
{
    @Override
    public Vehicle produce(){
        return new Bus();
    }
}
