package com.study.method.test;

public class test17 {

    /**
     * 输出9*9口诀
     * **/
    public static void main(String[] args){

        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
