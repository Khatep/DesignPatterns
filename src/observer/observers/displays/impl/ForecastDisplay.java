package observer.observers.displays.impl;

import observer.Observer;
import observer.subject.impl.WeatherDataSubject;
import observer.observers.displays.Display;

public class ForecastDisplay implements Observer, Display {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherDataSubject weatherDataSubject;

    public ForecastDisplay(WeatherDataSubject weatherDataSubject) {
        weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}
