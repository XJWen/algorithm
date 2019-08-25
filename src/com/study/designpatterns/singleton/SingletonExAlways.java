package com.study.designpatterns.singleton;

/**
 * 单例类(懒汉模式)
 * **/
public class SingletonExAlways {

    private  static volatile SingletonEx singletonEx = null;

    public SingletonExAlways(){ }

    public static SingletonEx getInstance(){
        if (singletonEx == null){
            synchronized (SingletonEx.class){
                if (singletonEx == null){
                    singletonEx = new SingletonEx();
                }
            }
        }
        return singletonEx;
    }
}
