package com.study.designpatterns.singleton;

/**
 * 单例类(饿汉模式)[创建唯一类对象]
 * 先创建静态属性
 * 后创建动态方法
 * **/
public class SingletonExOnly {

    private final static SingletonEx singletonEx = new SingletonEx();

    public SingletonExOnly(){ }

    public static SingletonEx getInstance(){
        return  singletonEx;
    }
}
