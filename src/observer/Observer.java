package observer;

import observer.observers.displays.impl.CurrentConditionsDisplay;
import observer.observers.displays.impl.ForecastDisplay;
import observer.observers.displays.impl.StatisticsDisplay;
import observer.subject.impl.WeatherDataSubject;

public interface Observer {
    void update();
}

class Runner {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDataSubject);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataSubject);

        weatherDataSubject.setMeasurements(80, 65, 30.4f);
        weatherDataSubject.setMeasurements(82, 70, 29.2f);
        weatherDataSubject.setMeasurements(78, 90, 29.2f);
    }
}