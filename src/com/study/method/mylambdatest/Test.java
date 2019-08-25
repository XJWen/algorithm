package com.study.method.mylambdatest;

import java.util.Optional;

public class Test {

    public static void main(String[] args){
        Person person = new Person();
        Optional<Person> personOptional = Optional.ofNullable(person);

        /*if (person!=null)
        {
            System.out.println(person);
        }else {
            System.out.println("UNKNOWN_PERSON");
        }*/
       personOptional.ifPresent(System.out::println);

    }
}
