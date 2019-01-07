package com.study.method.test;

public class test20 {

    /**
     * 打印出图案（菱形）
     * **/
    public static void main(String[] args){
        //高宽都为奇数，菱形更明显
        int H=9,W=9;
        //绘制上半部分
        for (int i=0;i<(H+1)/2;i++){
            //因为宽高等距，W/2为中心点距离边缘的最大距离，i为*个数
            for (int j=0;j<W/2-i;j++){
                System.out.print(" ");
            }
            //因为i起始值为0，故需要+1后*2得到偶数对，真实的*数比这个偶数-1
            for (int k=1;k<(i+1)*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //绘制下半部分
        for (int i=1;i<=H/2;i++){

            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //因为i代表着空格数，对称的i应该为偶数对
            for (int k=1;k<=W-2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
