package com.study.method.IOTest;

import java.io.*;

/**
 * OutputStream是整个IO包中字节输出流的最大父类
 *  如果想要使用此类的话，则首先必须通过子类实例化对象，那么如果现在要操作的是一个文件，
 *  则可以使用：FileOutputStream类。通过向上转型之后，可以为OutputStream实例化
 * **/
public class MyFileOutput {
    /**
     * 字节流输出
     * **/
    public static void main(String[] args)throws  IOException,FileNotFoundException {
        //File.separator将h:转换成文件系统的路径
        File file = new File("h:"+File.separator+"test01.txt");
        //如果文件不存在会自动创建
        OutputStream stream = new FileOutputStream(file);
        String str = "Hello World";
        //转化成字节数组进行输出
        byte[] btr = str.getBytes();
        //可逐字节输出，也可以字节数组输出，但不可同时进行
        stream.write(btr);
        //输出完毕一定要记住关流
        stream.close();
        //append 参数表示可在该文件下追加内容
        OutputStream outputStream = new FileOutputStream(file,true);
        String hello = "你好";
        byte[] bytes = hello.getBytes();
        for (int i =0;i<hello.length();i++){
            outputStream.write(bytes);
        }
        outputStream.close();
    }
}
