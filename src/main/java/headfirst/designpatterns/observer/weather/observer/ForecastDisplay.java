package headfirst.designpatterns.observer.weather.observer;

import headfirst.designpatterns.observer.weather.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.print("Improving weather on the way!\n");
        } else if (currentPressure == lastPressure) {
            System.out.print("More of the same\n");
        } else if (currentPressure < lastPressure) {
            System.out.print("Watch out for cooler, rainy weather\n");
        }
    }
}
