package com.study.method.mylambdatest;

/***
 * apple颜色筛选
 * **/
public class AppleColorPredicate implements ApplePredicate{

    private String color = "";

    public AppleColorPredicate(String color){
        this.color = color;
    }

    @Override
    public boolean test(Apple apple) {
        return color.equals(apple.getColor());
    }
}
