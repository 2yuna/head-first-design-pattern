package headfirst.designpatterns.observer.weather;

import headfirst.designpatterns.observer.weather.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weather.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weather.observer.HeatIndexDisplay;
import headfirst.designpatterns.observer.weather.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weather.subject.WeatherData;

import javax.swing.*;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
    }
}
