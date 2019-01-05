package com.study.method;

public class test03 {

    /**
     * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
     * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
     * **/
    public static void main(String[] args){
        //a是个位数，b是十位数，c是百位数
        int a,b,c;
        for (int i=1;i<1000;i++){
            a=i%10;
            b=i/10%10;
            c=i/100;
            if (a*a*a+b*b*b+c*c*c==i) {
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
