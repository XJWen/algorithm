package com.study.method.DIreflect;

import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args){
        //new 对象
        HelloF helloF = new HelloF();
        helloF.HelloF1();
        //反射方式1： 实例化对象.getClass()
        try{
            Class clazz = helloF.getClass();
            HelloF helloF1 = (HelloF)clazz.newInstance();
            helloF1.HelloF1();
        }catch (InstantiationException ex){
            ex.printStackTrace();
        }catch (IllegalAccessException ee){
            ee.printStackTrace();
        }

        //方式2    Class.forName通过类路径加载
        try{
            Class clazz = Class.forName("com.study.method.DIreflect.HelloF");
            HelloF helloF1 = (HelloF)clazz.newInstance();
            helloF1.HelloF1();
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (InstantiationException ee){
            ee.printStackTrace();
        }catch (IllegalAccessException ea){
            ea.printStackTrace();
        }
        //方式3 通过 类名.class来获取class对象
        Class clazz = HelloF.class;
        try {
            HelloF helloF1 = (HelloF)clazz.newInstance();
            helloF1.HelloF1();
            //获取包名
            System.out.println(clazz.getCanonicalName());
            //获取类名
            System.out.println(clazz.getSimpleName());
        }catch (InstantiationException ex){
            ex.printStackTrace();
        }catch (IllegalAccessException ee){
            ee.printStackTrace();
        }

        Method method = null;
        try {
            method = clazz.getDeclaredMethod("HelloF2",new Class[]{String.class});
        }catch (NoSuchMethodException ex){
            ex.printStackTrace();
        }
    }
}
