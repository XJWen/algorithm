package com.study.method.IOTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
    /**
     * 字符输出流
     * **/
    public static void main(String[] args)throws IOException {
        File file = new File("h:"+File.separator+"test02.txt");
        Writer writer = new FileWriter(file);
        //在默认情况下再次输出会覆盖，追加的方法也是在构造函数上加上追加标记
        Writer w = new FileWriter(file,true);
        String hello = "Hello World!";
        writer.write(hello);
        writer.close();
        w.close();
    }
}
