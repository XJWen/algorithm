package com.study.method.test;

import java.util.Scanner;

public class test06 {

    /**
     * 输入两个正整数m和n，求其最大公约数和最小公倍数。
     * /*在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
     * 取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，
     * 此数即为最大公约数，最小公倍数为两数之积除以最大公约数。 /
     * **/
    public static void main(String[] args){
        System.out.print("输入两个参数：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i =factor(a,b);
        System.out.println("最小公因数："+i);
        System.out.println("最大公倍数："+a*b/i);
    }

    public static int factor(int a,int b){
        if (a<b){
            int temp = b;
            b=a;
            a=temp;
        }
        while (b!=0){
            if (a==b){
                break;
            }
            int x=b;
            b=a%b;
            a=x;
        }
        return a;
    }
}
