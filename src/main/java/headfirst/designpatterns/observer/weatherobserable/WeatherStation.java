package headfirst.designpatterns.observer.weatherobserable;

import headfirst.designpatterns.observer.weatherobserable.observer.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weatherobserable.observer.ForecastDisplay;
import headfirst.designpatterns.observer.weatherobserable.observer.HeatIndexDisplay;
import headfirst.designpatterns.observer.weatherobserable.observer.StatisticsDisplay;
import headfirst.designpatterns.observer.weatherobserable.subject.WeatherData;

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
