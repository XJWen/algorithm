package com.study.method.test;

import java.util.Scanner;

public class test13 {

    /**
     * 一个自然数减去45及加上44都仍是完全平方数，求此数。
     * **/
    public static void main(String[] args){
        for (int i=-100;i<=10000;i++){
            if(Math.sqrt(i+44)%1==0&&Math.sqrt(i-45)%1==0){
                System.out.println("该完全平方数是"+i);
            }
        }
    }
}
