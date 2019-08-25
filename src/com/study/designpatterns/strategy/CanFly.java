package com.study.designpatterns.strategy;

/**
 * 通过引用行为接口，构建行为类，相同接口下的行为类构成一个行为族。
 **/
public class CanFly implements FlyBehvior{
    @Override
    public void fly() {
        System.out.println("……can Fly……");
    }
}
