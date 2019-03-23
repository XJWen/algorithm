package com.study.method.test;

public class test01 {

    /**
     * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     * 斐波那契数列 指数爆炸
     * **/
    public static void main(String[] args){
        //f1代表父代，f2代表子代，1代表一对兔子,M表示第几代
        int f1=1,f2=1,f;
        int M=7;
        System.out.println(f1);
        System.out.println(f2);
        for (int i=3;i<=M;i++){
            f=f2;
            f2=f1+f2;
            f1=f;
        }
        System.out.println("常规推演："+f2);
        System.out.println("递归推演："+f1(M));
    }
    /**
     * 斐波那契数列的经典递归方法
     * **/
    public static int f1(int n){

        if (n==1||n==2){
            return 1;
        }else {
            return f1(n-1)+f1(n-2);
        }
    }
}
