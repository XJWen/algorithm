package com.study.method.mylambdatest;

/***
 * apple重量筛选
 ***/
public class AppleWeightPredicate implements ApplePredicate{

    private double weight = 0;

    public AppleWeightPredicate(double weight){
        this.weight = weight;
    }

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>weight;
    }
}
