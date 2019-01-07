package com.study.method.test;

public class test21 {

    /**
     * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
     * **/
    public static void main(String[] args){
        double sum =0,ver=2;
        double n =2,temp=1;
        for (int i=1;i<=20;i++){
            if (i==1){
                sum+=ver/i;
                System.out.print(ver+"/"+i);
            }else if (i%5==0){
                temp = n;
                sum+=ver/n;
                System.out.println("+"+ver+"/"+n);
                n = ver;
            } else {
                temp = n;
                sum+=ver/n;
                System.out.print("+"+ver+"/"+n);
                n = ver;
            }
            ver+=temp;
        }
        System.out.println("="+sum);
    }
}
