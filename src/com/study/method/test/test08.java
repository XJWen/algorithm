package com.study.method.test;

import java.util.Scanner;

public class test08 {

    /**
     * 求s=a+aa+aaa+aaaa+aa…a的值，
     * 其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
     * **/
    public static void main(String[] args){
        System.out.print("请输入两个数(a,b)[a代表底数,b代表加数]:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        int sum =0;
        //b负责记住尾数
        int b =0;
        for (int i=0;i<n;i++){
            b+=a;
            if (i==n-1){
                System.out.print(b);
            }else {
                System.out.print(b+"+");
            }
            sum +=b;
            a = a*10;
        }
        System.out.println("="+sum);
    }
}
