package observer;

import observer.observer.impl.CurrentConditionsDisplay;
import observer.observer.impl.StatisticsDisplay;
import observer.subject.impl.WeatherData;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurement(80, 65, 30.4f);
    weatherData.setMeasurement(82, 70, 29.2f);
    weatherData.setMeasurement(78, 90, 29.2f);
  }
}
