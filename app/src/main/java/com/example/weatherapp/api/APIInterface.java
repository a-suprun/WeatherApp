package com.example.weatherapp.api;

import com.example.weatherapp.model.CurrentWeather;
import com.example.weatherapp.model.DailyForecast;
import com.example.weatherapp.model.HourlyForecast;
import com.example.weatherapp.model.LocationResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface APIInterface {

    @GET("/locations/v1/cities/geoposition/search")
    Call<LocationResponse> getLocationKey(
            @Query("apikey") String apikey,
            @Query("q") String coordinates);

    @GET("/currentconditions/v1/{locationKey}}")
    Call<CurrentWeather> getCurrentWeather(
            @Query("apikey") String apikey,
            @Path("locationKey") int locationKey,
            @Query("metric") boolean metric,
            @Query("details") boolean details);

    @GET("/forecasts/v1/daily/5day/{locationKey}")
    Call<List<DailyForecast>> get5DaysForecast(
            @Query("apikey") String apikey,
            @Path("locationKey") int locationKey,
            @Query("metric") boolean metric);

    @GET("/forecasts/v1/hourly/12hour/{locationKey}")
    Call<List<HourlyForecast>> get12HoursForecast(
            @Query("apikey") String apikey,
            @Query("locationKey") int locationKey,
            @Query("metric") boolean metric,
            @Query("details") boolean details);
}
