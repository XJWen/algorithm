package com.study.method.aopproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  通过动态代理实现Aop
 *  代理模式是为了提供额外或不同的操作，而插入的用来替代”实际”对象的对象，这些操作涉及到与”实际”对象的通信，
 *  因此代理通常充当中间人角色。
 *  Java的动态代理比代理的思想更前进了一步，它可以动态地创建并代理并动态地处理对所代理方法的调用。（不受对象类型限制）
 * **/
public class proxyTest implements InvocationHandler {
    //调用对象
    private Object proxy;
    //目标对象
    private Object target;

    /**
     *   通过反射来实例化目标对象
     * **/
    public  Object bind(Object target,Object proxy){
        this.proxy = proxy;
        this.target = target;
        //可以创建动态代理
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //反射得到操作者的实例
        Class clazz = this.proxy.getClass();
        //通过反射获得操作者的start方法
        Method start = clazz.getDeclaredMethod("start",new Class[]{Method.class});
        //反射执行start方法
        start.invoke(this.proxy,new Object[]{method});
        //执行要处理对象的原方法
        method.invoke(this.target,args);
        //通过反射获得end方法
        Method end = clazz.getDeclaredMethod("end",new Class[]{Method.class});
        //反射执行end方法
        end.invoke(this.proxy,new Object[]{method});
        return result;
    }

    public static void main(String[] args){
        //如果我们需要日志功能，则使用代理类
        IHello hello = (IHello) new proxyTest().bind(new MyHello(),new DLogger());
        //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
        hello.sayHello("明天");
    }
}
