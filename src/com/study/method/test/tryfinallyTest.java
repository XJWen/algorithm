package com.study.method.test;

/**
 * try catch finally 块的执行顺序
 * **/
public class tryfinallyTest {

    public static void main(String[] args){

        try {
//            int i = 10;
//            i = i/0;

            System.out.println("try 块");
            return;
        }catch (ArithmeticException ex){//分母不能为零
            System.out.println("catch 块");
            return;
        }finally {
            System.out.println("finally 块");
//            return;
        }
    }
}
