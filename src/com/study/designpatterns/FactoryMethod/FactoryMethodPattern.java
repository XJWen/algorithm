package com.study.designpatterns.FactoryMethod;

/**
 * 工厂方法模式
 * **/
public class FactoryMethodPattern {

    /**
     * 运用上转型来调用工厂接口
     * **/
    public static void main(String[] args){
        Factory carfactory = new CarFactory();
        Vehicle car = carfactory.produce();
        car.run();

        Factory bicyclefactory = new BicycleFactory();
        Vehicle bicycle = bicyclefactory.produce();
        bicycle.run();
    }
}
