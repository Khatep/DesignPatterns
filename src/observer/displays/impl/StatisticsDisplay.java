package observer.displays.impl;

import lombok.AllArgsConstructor;
import observer.Observer;
import observer.subject.impl.WeatherDataSubject;
import observer.displays.Display;

@AllArgsConstructor
public class StatisticsDisplay implements Observer, Display {
    private WeatherDataSubject weatherDataSubject;
    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}
