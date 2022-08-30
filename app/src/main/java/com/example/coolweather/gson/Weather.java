package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    //查询成功返回OK。查询失败返回具体原因
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
