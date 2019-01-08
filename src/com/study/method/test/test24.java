package com.study.method.test;

import java.util.Scanner;

public class test24 {

    /**
     *一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
     * **/
    public static void main(String[] args){
        System.out.print("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(ver(num)?"是回文数":"不是回文数");
    }

    public static boolean ver(int num){
        if (num<0||num!=0&&num%10==0){
            return false;
        }
        int count =0;
        while (num>count){
            count = count*10+num%10;
            num = num/10;
        }
        return (num==count)||(num==count/10);
    }
}
