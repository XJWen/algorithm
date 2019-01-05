package com.study.method;

public class test01 {

    /**
     * 斐波那契数列
     * **/
    public static void main(String[] args){
        int f1=1,f2=1,f;
        int M=30;
        System.out.println(f1);
        System.out.println(f1);
        for (int i=3;i<M;i++){
            f=f2;
            f1=f1+f2;
            f1=f;
            System.out.println(f1);
        }
    }
}
