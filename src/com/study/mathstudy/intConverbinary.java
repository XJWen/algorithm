package com.study.mathstudy;

import java.math.BigInteger;

public class intConverbinary {

    /**
     * 将十进制数据通过BigInteger来转换，2进制数据通过String返回
     * **/
    public static String decimalToBinary(int decimalSource){
        //默认是十进制
        BigInteger binary = new BigInteger(String.valueOf(decimalSource));
        return binary.toString(2);
    }

    /**
     * 将二进制字符串数据通过BigInteger来转换成int十进制数据
     * **/
    public static int binaryToDecimal(String binarySource){
        //通过2将字符串定义成2进制数
        BigInteger decimal = new BigInteger(binarySource,2);
        return Integer.parseInt(decimal.toString());
    }

    public static void main(String[] args){
        String binary = "0101";
        int decimal = 12;
        String str2 = decimalToBinary(decimal);
        int num10 = binaryToDecimal(binary);
        System.out.println(String.format("十进制数字 %d 的二进制表示 %s",decimal,str2));
        System.out.println(String.format("二进制数字 %s 的十进制表示 %d",binary,num10));
    }
}
