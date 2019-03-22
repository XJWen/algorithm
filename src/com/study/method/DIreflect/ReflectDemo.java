package com.study.method.DIreflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    /**
     * 通过反射与一个未知类型的对象打交道时，JVM只是简单地检查这个对象，看它属于哪个特定的类。运行时打开和检查class文件
     * **/
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

        //方式2    Class.forName通过类路径加载，会自动初始化该Class对象
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
        //方式3 通过 类名.class来创建class对象，不会自动初始化该Class对象
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
        //通过反射访问private方法
        Method method = null;
        try {
            method = clazz.getDeclaredMethod("HelloF2",new Class[]{String.class});
            //抑制java的访问检查控制
            method.setAccessible(true);
            String str = (String)method.invoke(helloF,new Object[]{"zhaozilong"});
            System.out.println(str);
        }catch (NoSuchMethodException ex){
            ex.printStackTrace();
        }catch (InvocationTargetException ex){
            ex.printStackTrace();
        }catch (IllegalAccessException ee){
            ee.printStackTrace();
        }
        //访问私有属性
        Field field = null;
        try {
            field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            field.set(helloF,"guojin");
            System.out.println("name:"+helloF.getName());
        }catch (NoSuchFieldException ex){
            ex.printStackTrace();
        }catch (IllegalAccessException ee){
            ee.printStackTrace();
        }
    }
}
