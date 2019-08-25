package com.study.designpatterns.observer;

/**
 * 观察者，负责更新数据
 * */
public interface Observe {
    void update(float temperature,float pressure,float humidity);
}
