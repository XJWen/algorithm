package com.study.method.test;

/**
 * Java 多态性演示程序
 * **/
public class polymorphic {



    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        B d2 = new D();//类型为B，继承A

        System.out.println("A1--B:"+a1.show(b)+"  C:"+a1.show(c)+"  D:"+a1.show(d));
        System.out.println("A2--B(子类覆盖从父类继承的方法):"+a2.show(b)+"  C:"+a2.show(c)+"  D:"+a2.show(d)+"  D2:"+a2.show(d2));//向上转型，调用子类继承的方法以子类为基准，其余以父类类为基准
        System.out.println("B--A1:"+b.show(a1)+"  A2:"+b.show(a2)+"  B:"+b.show(b)+" C:"+b.show(c)+" D:"+b.show(d));
    }
}

class A{

    public String show(D obj){
        return ("A and D");
    }

    public String show(A obj){
        return ("A and A");
    }
}

class B extends A{

    public String show(B obj){
        return ("B and B");
    }

    @Override
    public String show(A obj){
        return ("B and A");
    }
}

class C extends B{

}

class  D extends B{

}