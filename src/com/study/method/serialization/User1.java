package com.study.method.serialization;

import java.io.Serializable;

/**
 * 对象序列化保存的是对象的"状态",即成员变量,序列化不关注静态变量
 * *
 * 当试图对一个对象进行序列化的时候，如果遇到不支持 Serializable 接口的对象。在此情况下，将抛出NotSerializableException。
 * 如果要序列化的类有父类，要想同时将在父类中定义过的变量持久化下来，那么父类也应该集成java.io.Serializable接口。
 * **/
public class User1 implements Serializable {

    private String name;
    private int age;
    private static final long serialVersionUID = -6849794470754667710L;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
