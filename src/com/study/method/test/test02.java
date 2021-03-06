package com.study.method.test;

public class test02 {

    /**
     * 判断101-200之间有多少个素数，并输出所有素数。
     * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
     * **/
    public static void main(String[] args){
        int count =0;
        //+=2是因为10+偶数一定非素数
        for (int i=101;i<200;i+=2){
            boolean flag =true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag==true){
                count++;
                System.out.println(i+"是素数");
            }
        }
        System.out.println("素数个数总共有"+count);
    }
}
