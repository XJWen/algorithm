package com.study.designpatterns.singleton;

/**
 * 静态内部类单例模式
 * **/
public class SingletonExStaticAlways {

    //1.私有的内部静态类，类加载器负责加锁
    private static class SingletonHolder{
        private  static  SingletonEx singletonEx = new SingletonEx();
    }
    //2.私有化构造方法
    private SingletonExStaticAlways(){
        /***
         * 防止通过反射来获取单例
         * **/
        if (SingletonHolder.singletonEx!=null){
            throw new RuntimeException("不可反复创建单例");
        }
    }
    //3.自行对外提供实例
    public static final SingletonEx getInstance(){

            return SingletonHolder.singletonEx;

    }
}
