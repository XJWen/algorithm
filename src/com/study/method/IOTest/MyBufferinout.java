package com.study.method.IOTest;

import java.io.*;

public class MyBufferinout {

    public static void main(String[] args)throws IOException,FileNotFoundException{
        File test01 = new File("h:"+File.separator+"test01.txt");
        InputStream stream = new FileInputStream(test01);
        OutputStream outputStream = new FileOutputStream(test01,true);
        BufferedReader in = new BufferedReader(new InputStreamReader(stream));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        String str = in.readLine();
        System.out.println(str);
        out.close();
    }
}
