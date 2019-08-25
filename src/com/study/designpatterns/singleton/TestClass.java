package com.study.designpatterns.singleton;

/**
 * 单例模式实例
 * @author xjWen
 * @create 2019/8/6
 * **/
public class TestClass {

    public static void main(String[] args){
        SingletonEx singletonEx1 = SingletonExOnly.getInstance();
        SingletonEx singletonEx2 = SingletonExAlways.getInstance();
        SingletonEx singletonEx3 = SingletonExStaticAlways.getInstance();
    }
}
