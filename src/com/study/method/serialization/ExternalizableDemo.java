package com.study.method.serialization;

import java.io.*;

public class ExternalizableDemo {

    public static void main(String[] args)throws IOException{
        User2 user2 = new User2();
        user2.setName("hollis");
        user2.setAge(26);
        System.out.println(user2.toString());

        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("h:"+ File.separator+"tempUser2"));
            outputStream.writeObject(user2);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            outputStream.close();
        }

        File file = new File("h:"+File.separator+"tempUser2");
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream(file));
            //不重写实现接口方法，之前的那个对象的状态不能被持久化下来。
            User2 newuser = (User2)inputStream.readObject();
            System.out.println("new--"+newuser.toString());
        }catch (IOException ex){
            ex.printStackTrace();
        }catch (ClassNotFoundException ee){
            ee.printStackTrace();
        }finally {
            inputStream.close();
        }
    }
}
