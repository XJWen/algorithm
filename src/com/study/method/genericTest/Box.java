package com.study.method.genericTest;

import java.util.ArrayList;
import java.util.List;

/**
 * ·泛型类的声明和非泛型类的声明类似，除了在类名后面添加了类型参数声明部分。
 *·和泛型方法一样，泛型类的类型参数声明部分也包含一个或多个类型参数，参数间用逗号隔开。
 * ·一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
 * ·因为他们接受一个或多个参数，这些类被称为参数化的类或参数化的类型。
 * **/
public class Box<T> {

    private T box;
    public void add(T t){
        this.box = t;
    }

    public T getBox() {
        return box;
    }
    /**
     * 类型通配符一般是使用?代替具体的类型参数。
     * 例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
     * **/
    public static void getData(List<?> data){
        System.out.println("data:"+data.get(0));
    }

    /**
     * 参数已经限定了参数泛型上限为Number，所以泛型为String是不在这个范围之内，所以会报错
     * **/
    public static void getUpData(List<? extends Number> data){
        System.out.println("data>>:"+data.get(0));
    }

    /**
     * 类型通配符下限通过形如 List<? super Number>来定义，
     * 表示类型只能接受Number及其三层父类类型，如Objec类型的实例。
     * **/
    public static void getDownData(List<? super Number> data){
        System.out.println("data<<:"+data.get(0));
    }

    public static void main(String[] args){
        Box<Character> b1 = new Box<>();
        Box<String> b2 = new Box<>();

        b1.add('A');
        b2.add("菜鸟教程");

        System.out.printf("%c\n",b1.getBox());
        System.out.printf("%s\n\n",b2.getBox());

        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        name.add("icon");
        age.add(18);
        number.add(21.23);
        objects.add(b2.getBox());

        getData(name);
        getData(age);
        getData(number);

        //getUpData(name);
        getUpData(age);
        getUpData(number);

        //getDownData(age);
        getDownData(number);
        getDownData(objects);
    }
}
