package observer;

import observer.displays.impl.CurrentConditionsDisplay;
import observer.displays.impl.ForecastDisplay;
import observer.displays.impl.StatisticsDisplay;
import observer.subject.impl.WeatherDataSubject;

public class Runner {
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