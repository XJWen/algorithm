package com.study.designpatterns.observer;

import java.util.ArrayList;

/**
 * 气象站数据
 * */
public class WeatherData implements Subject{
    //温度
    private float mTemperature;
    //气压
    private float mPressure;
    //湿度
    private float mHumidity;

    private ArrayList<Observe> mObserves;

    //第三方接入用类来表示扩展性差
    private CurrentCondition condition;

    public WeatherData(){
        mObserves = new ArrayList<>();
    }

    /**
     * 通过引入类的方法扩展性差
     * */
    public WeatherData(CurrentCondition currentCondition){
        this.condition = currentCondition;
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void DataChange(){
        if (condition!=null){
            condition.update(getmTemperature(),getmPressure(),getmHumidity());
        }else {
            notifyObservers();
        }
    }

    /**
     * 模拟气象站获取数据放入公告板
     * */
    public void setData(float temperature,float pressure,float humidity){
        this.mTemperature = temperature;
        this.mPressure = pressure;
        this.mHumidity = humidity;
        DataChange();
    }

    @Override
    public void registerObserver(Observe observe) {
        mObserves.add(observe);
    }

    @Override
    public void removeObserver(Observe observe) {
        //当observe存在于ArrayList中
        if (mObserves.contains(observe)){
            mObserves.remove(observe);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i =0,len = mObserves.size();i<len;i++){
            mObserves.get(i).update(getmTemperature(),getmPressure(),getmHumidity());
        }
    }
}
