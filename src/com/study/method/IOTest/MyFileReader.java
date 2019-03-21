package com.study.method.IOTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
    /**
     * 字符输入流
     * **/
    public static void main(String[] args)throws IOException {
        File file = new File("h:"+File.separator+"test02.txt");
        Reader reader = new FileReader(file);
        Reader input = new FileReader(file);
        char[] chars = new char[1024];
        char[] chs = new char[1024];
        int temp = 0,len = 0;
        //利用循环来判断读完
        while ((temp=input.read())!=-1){
            chs[len] = (char)temp;
            len++;
        }
        int length = reader.read(chars);
        input.close();
        reader.close();
        System.out.println(new String(chars,0,length));
        System.out.println(new String(chs));
    }
}
