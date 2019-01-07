package com.study.method.test;

import java.util.Scanner;

public class test14 {

    /**
     * 输入某年某月某日，判断这一天是这一年的第几天？
     * **/
    public static void main(String[] args){
        int year=1,month=1,day=1;
        int d =0,days=0;
        boolean flag =true;
        while (flag){
            System.out.print("输入当前年份:");
            year = input();
            System.out.print("输入当前月份:");
            month = input();
            System.out.print("输入当前日期：");
            day = input();
            if (year<=0||month<=0||month>12||day<=0||day>31){
                System.out.println("输入错误格式日期，请重新输入。");
            }else {
                flag = false;
            }
        }
        for (int i=1; i <month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    //闰年的计算方法
                    if ((year % 400 == 0) || (year % 4 == 0&& year % 100 != 0)) {
                        System.out.println(year+"是闰年");
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            d += days;
        }
        System.out.println(year + "-" + month +"-" + day + "是这年的第" +(d+day) + "天。");
    }


    public static int input(){
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        return value;
    }

}
