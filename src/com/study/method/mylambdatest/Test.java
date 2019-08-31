package com.study.method.mylambdatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

       /**
        * 通过接口定义来筛选
        * **/
       List<Apple> apples = Arrays.asList(new Apple("green",80),
               new Apple("red",110),
               new Apple("green",160),
               new Apple("red",87));
       List<Apple> heavyApples = filterApplr(apples,new AppleWeightPredicate(100));
       for (Apple apple :heavyApples){
           System.out.println(String.format("apple's weight is %f,color is %s",apple.getWeight(),apple.getColor()));
       }
       List<Apple> GreenApples = filterApplr(apples,new AppleColorPredicate("green"));
        for (Apple apple :GreenApples){
            System.out.println(String.format("apple's weight is %f,color is %s",apple.getWeight(),apple.getColor()));
        }
    }

    public static List<Apple> filterApplr(List<Apple> inventory,ApplePredicate applePredicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return  result;
    }
}
