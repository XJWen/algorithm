package com.study.method;

public class test01 {

    /**
     * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     * 斐波那契数列 指数爆炸
     * **/
    public static void main(String[] args){
        //f1代表父代，f2代表子代，1代表一对兔子
        int f1=1,f2=1,f;
        int M=30;
        System.out.println(f1);
        System.out.println(f2);
        for (int i=3;i<M;i++){
            f=f2;
            f2=f1+f2;
            f1=f;
            System.out.println(f2);
        }
    }
}
