package com.study.method.test;

public class test11 {

    /**
     * 有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。
     * **/
    public static void main(String[] args){
        int count =0;
        int n =4;
        //三重循环还需改进
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n;j++){
                for (int k=1;k<=n;k++){
                    if (i!=j&&j!=k&&i!=k){
                        System.out.println(i*100+j*10+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("总共有"+count+"种组合");
    }
}
