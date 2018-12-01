package com.study.method;

/**
 * 经典汉诺塔问题
 * **/
public class Hanoi {

    /**
     * @param n 圆盘数
     * @param formpeg 出发柱 A
     * @param topeg 终点柱 C
     * @param auxpeg 辅助柱 B
     * **/
    public static void TowersOfHanoi(int n,char formpeg,char topeg,char auxpeg){
        /*如果只有一个圆盘，直接移动*/
        if (n == 1){
            System.out.println("Move one disk form "+formpeg+" to "+topeg);
            return;
        }
        /*利用C作为辅助，将n-1个圆盘从A移动到B*/
        TowersOfHanoi(n-1,formpeg,auxpeg,topeg);
        /*将余下的圆盘从A移动到C*/
        System.out.println("Move disk form "+formpeg+" to "+topeg);
        /*利用A作为辅助，将B柱的n-1个圆盘移动到C柱*/
        TowersOfHanoi(n-1,auxpeg,topeg,formpeg);
    }
}
