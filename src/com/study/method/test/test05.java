package com.study.method.test;

import java.util.Scanner;

public class test05 {

    public static void main(String[] args){
        System.out.print("输入分数：");
        Scanner scanner=new Scanner(System.in);
        int score = scanner.nextInt();
        char grade = score>=90?'A':score>=75?'B':score>=60?'C':'D';
        System.out.println("当前成绩为:"+grade);
    }
}
