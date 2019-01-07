package com.study.method.test;

public class test18 {

    /**
     * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
     * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
     * 以后每天早上都吃了前一天剩下 的一半零一个。
     * 到第10天早上想再吃时，见只剩下一个桃子了。
     * 求第一天共摘了多少。
     * **/
    public static void main(String[] args){
        int x =1;
        for (int i =9;i>=1;i--){
            //通过比对规律可得，y/2 - 1 =x；y为当天所有桃子，x为第二天的桃子数
            x = (x+1)*2;
        }
        System.out.println("一共摘了"+x+"个桃子");
    }
}
