package com.study.method.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 当使用Externalizable接口来进行序列化与反序列化的时候
 * 需要开发人员重写writeExternal()与readExternal()方法。
 *
 * 在使用Externalizable进行序列化的时候，在读取对象时，会调用被序列化类的无参构造器去
 * 创建一个新的对象，然后再将被保存对象的字段的值分别填充到新对象中。
 * 所以，实现Externalizable接口的类必须要提供一个public的无参的构造器。
 * **/
public class User2 implements Externalizable {
    private String name;
    private int age;

    public  User2(){}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeInt(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String)in.readObject();
        this.age = in.readInt();
    }

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
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
