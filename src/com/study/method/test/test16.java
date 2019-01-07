package com.study.method.test;

import java.util.Scanner;

public class test16 {

    public static void main(String[] args){
        System.out.print("请输入三个数：");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int temp = 0;
        if (x>y){
            temp = y;
            y = x;
            x = temp;
        }
        if (y>z){
            temp = z;
            z = y;
            y = temp;
        }
        if (x>y){
            temp = y;
            y = x;
            x = temp;
        }
        System.out.println("排序从小到大："+x+" "+y+" "+z);
    }
}
