package com.study.method.test;

import java.util.Scanner;

public class test23 {

    /**
     * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
     * //使用了长整型最多输入18位
     * **/
    public static void main(String[] args){
        System.out.print("请输入5位数：");
        Scanner input =new Scanner(System.in);
        String num = input.nextLine();
        System.out.println("位数："+num.length());
        char[] chars = num.toCharArray();
        for (int i=num.length();i>0;i--){
            System.out.print(chars[i-1]);
        }
    }
}
