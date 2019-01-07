package com.study.method.test;

public class test10 {

    /**
     * 典型的折半问题的变化
     * 一球从100米高度自由落下，
     * 每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
     * **/
    public static void main(String[] args){

        double high = 100;
        double s = 100;
        for (int i=1;i<=10;i++){
            high = high/2;
            //high*2 从地面弹起再落下，高度差一样
            s = s+2*high;
        }
        System.out.println("高度："+high+" 总共移动距离："+s);
    }
}
