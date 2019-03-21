package com.study.method.serialization;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args)throws IOException{

        User1 user1 = new User1();
        user1.setName("Jams");
        user1.setAge(24);
        System.out.println(user1.toString());

        ObjectOutputStream outputStream = null;
        try{
            outputStream = new ObjectOutputStream(new FileOutputStream("h:"+File.separator+"tempUser"));
            outputStream.writeObject(user1);
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            outputStream.close();
        }

        File file = new File("h:"+File.separator+"tempUser");
        ObjectInputStream inputStream = null;
        try{
            inputStream = new ObjectInputStream(new FileInputStream(file));
            User1 newuser = (User1)inputStream.readObject();
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
