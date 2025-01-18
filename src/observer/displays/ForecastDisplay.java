package observer.displays;

import observer.Observer;
import observer.WeatherData;

public class ForecastDisplay implements Observer, Display {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}
