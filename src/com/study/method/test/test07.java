package com.study.method.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test07 {


    public static void main(String[] args){
        int abccount=0;
        int unicodecount =0;
        int spacecount=0;
        int numcount=0;
        int othercount=0;

        System.out.print("输入一行字符串：");
        Scanner input = new Scanner(System.in);
        String str =input.nextLine();
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if (isEnglish(String.valueOf(chars[i]))){
                abccount++;
            }else if (Character.isDigit(chars[i])){
                numcount++;
            }else if (Character.isSpaceChar(chars[i])){
                spacecount++;
            }else if (isChinese(String.valueOf(chars[i]))){
                unicodecount++;
            }else {
                othercount++;
            }
        }
        System.out.println("该字符串一共有"+abccount+"个英文符,"+numcount+"个数字符，"
                +spacecount+"个空格，"+unicodecount+"中文符，"+othercount+"个其余字符");
    }

    public static boolean isEnglish(String string){
        return string.matches("^[a-zA-Z]$");
    }

    public static boolean isChinese(String string){
        //基本汉字的Unicode范围
        String regx = "[\\u4e00-\\u9fa5]+";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()){
            return true;
        }else {
            return false;
        }
    }
}
