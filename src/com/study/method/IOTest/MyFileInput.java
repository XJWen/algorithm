package com.study.method.IOTest;

import java.io.*;

public class MyFileInput {
    /***
     * 字节流读取文件
     * */
    public static void main(String[] args)throws IOException,FileNotFoundException {
        File file = new File("h:"+File.separator+"test01.txt");
        InputStream stream = new FileInputStream(file);
        InputStream inputStream = new FileInputStream(file);
        //这是已知文件大小情况
        byte[] btr = new byte[(int)file.length()];
        //这是未知文件大小的处理方式
        byte[] bytes = new byte[1024];
        int temp = 0,len =0;
        //-1标志文件读完
        while ((temp=stream.read())!=-1){
            bytes[len] = (byte)temp;
            len++;
        }
        //将读取的长度存在length中，读取的数据存在btr中
        int length = inputStream.read(btr);
        stream.close();
        inputStream.close();
        //从byte数组的第0个读到length个
        System.out.println(new String(btr,0,length));
        System.out.println(new String(bytes));
    }
}
