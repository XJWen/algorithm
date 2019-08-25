package com.study.designpatterns.observer;

/**
 * 气象数据公告版
 * */
public class CurrentCondition implements Observe{

    //温度
    private float mTemperature;
    //压强
    private float mPressure;
    //湿度
    private float mHumidity;

    /**
     * 更新数据
     * */
    @Override
    public void update(float temperature,float pressure,float humidity){
        this.mTemperature = temperature;
        this.mPressure = pressure;
        this.mHumidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Today temperature"+mTemperature+" pressure"+mPressure+" humidity"+mHumidity);
    }
}
