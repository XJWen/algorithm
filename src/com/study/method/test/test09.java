package com.study.method.test;

public class test09 {

    /**
     * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
     * 例如6=1＋2＋3. 编程找出10000以内的所有完数。
     * **/
    public static void main(String[] args){
        for (int i=1;i<=10000;i++){
            int t =0;
            //2为最小素数。i/2则为i的最大公因数(假定)
            for (int j=1;j<=i/2;j++){
                if (i%j==0){
                    t+=j;
                }
            }
            if (t==i){
                System.out.println(i+"是完数。");
            }
        }
    }
}
