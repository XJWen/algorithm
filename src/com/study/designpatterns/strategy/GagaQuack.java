package com.study.designpatterns.strategy;

public class GagaQuack implements QuackBehvior{
    @Override
    public void Quack() {
        System.out.println("……say GaGa……");
    }
}
