package com.study.method.test;

public class test22 {

    /**
     * 求1+2!+3!+…+20!的和
     * 利用递归方法求5!。
     * **/
    public static void main(String[] args){
        long sum =0,ver =1;
        for (int i=1;i<=20;i++){
            ver = ver*i;
            sum+=ver;
            if (i!=20){
                System.out.print(ver+"+");
            }else {
                System.out.print(ver);
            }

        }
        System.out.println("="+sum);

        System.out.println(fnc(5));
    }

    public static  long fnc(long n){
        if (n==1){
            return 1;
        }else {
            return n*fnc(n-1);
        }
    }
}
