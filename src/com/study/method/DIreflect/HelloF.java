package com.study.method.DIreflect;

public class HelloF {

    private String  name;

    public void HelloF1(){
        System.out.println("Hello -- f1");
    }

    private String HelloF2(String string){
        return "Hello:"+string;
    }

    public String getName() {
        return name;
    }
}
