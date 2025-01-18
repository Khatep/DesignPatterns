package observer.displays.impl;

import lombok.Getter;
import lombok.Setter;
import observer.Observer;
import observer.subject.impl.WeatherDataSubject;
import observer.displays.Display;

@Getter
@Setter
public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherDataSubject weatherDataSubject;

    public CurrentConditionsDisplay(WeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        weatherDataSubject.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherDataSubject.getTemperature();
        this.humidity = weatherDataSubject.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
