package observer.displays;

import observer.Observer;
import observer.WeatherData;

public class HeatIndexDisplay implements Observer, Display {
    private float heatindex;
    private WeatherData weatherData;
    @Override
    public void update() {
        this.heatindex = weatherData.getHeatindex();
    }

    @Override
    public void display() {

    }
}
