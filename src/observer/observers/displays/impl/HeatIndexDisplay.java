package observer.observers.displays.impl;

import observer.Observer;
import observer.subject.impl.WeatherDataSubject;
import observer.observers.displays.Display;

public class HeatIndexDisplay implements Observer, Display {
    private float heatindex;
    private WeatherDataSubject weatherDataSubject;
    @Override
    public void update() {
        this.heatindex = weatherDataSubject.getHeatIndex();
    }

    @Override
    public void display() {

    }
}
