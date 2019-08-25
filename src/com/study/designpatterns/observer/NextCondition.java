package com.study.designpatterns.observer;

public class NextCondition implements Observe{

    //温度
    private float mTemperature;
    //压强
    private float mPressure;
    //湿度
    private float mHumidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.mTemperature = temperature;
        this.mPressure = pressure;
        this.mHumidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Tomorrow temperature"+mTemperature+" pressure"+mPressure+" humidity"+mHumidity);
    }
}
