package observer.displays;

import lombok.AllArgsConstructor;
import observer.Observer;
import observer.WeatherData;

@AllArgsConstructor
public class StatisticsDisplay implements Observer, Display {
    private WeatherData weatherData;
    @Override
    public void update() {

    }

    @Override
    public void display() {

    }
}
