package com.study.method.test;


public class test15 {

    /**
     * 闰年的判断机制
     * **/
    public static void main(String[] args){
        for (int year=1990;year<=2050;year++){
            if ((year % 400 == 0) || (year % 4 == 0&& year % 100 != 0)) {
                System.out.println(year+"是闰年");

            }
        }
    }
}
