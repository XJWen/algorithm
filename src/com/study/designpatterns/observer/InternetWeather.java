package com.study.designpatterns.observer;

public class InternetWeather {

    public static void main(String[] args){
        CurrentCondition condition = new CurrentCondition();
        NextCondition nextCondition = new NextCondition();

        WeatherData weatherData = new WeatherData(condition);
        WeatherData weatherData1 = new WeatherData();
/*        weatherData1.registerObserver(condition);*/
        weatherData1.registerObserver(nextCondition);


        weatherData.setData(38,400,60.6f);
        weatherData1.setData(43,1000,96.0f);
    }
}
