package com.study.method.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  通过动态代理实现Aop
 * **/
public class proxyTest implements InvocationHandler {
    //调用对象
    private Object proxy;
    //目标对象
    private Object target;

    /**
     *   通过反射来实例化目标对象
     * **/
    public Object bind(Object target,Object proxy){
        this.proxy = proxy;
        this.target = target;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
