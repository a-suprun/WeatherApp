package com.example.weatherapp.screen.home;

import com.example.weatherapp.model.CurrentWeather;
import com.example.weatherapp.model.DailyForecast;

import java.util.List;

interface HomeContract {

    interface View {

        void setCurrentWeather(CurrentWeather currentWeather);

        void setDailyForecasts(List<DailyForecast> dailyForecastList);
    }

    interface Presenter {

        void dropView();

        void getDailyForecasts();

        void getCurrentWeather();

    }
}
