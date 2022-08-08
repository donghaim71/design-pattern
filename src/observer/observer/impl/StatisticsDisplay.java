package observer.observer.impl;

import observer.observer.DisplayElement;
import observer.observer.Observer;
import observer.subject.impl.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = Float.MIN_VALUE;
  private float averageTemp;
  private float minTemp = Float.MAX_VALUE;
  private WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out
        .println("평균/최고/최저 온도 = " + this.averageTemp + "/" + this.maxTemp + "/" + this.minTemp);

  }

  @Override
  public void update() {
    float currentTemp = weatherData.getTemperature();
    this.maxTemp = Float.max(this.maxTemp, currentTemp);
    this.minTemp = Float.min(this.minTemp, currentTemp);
    this.averageTemp = Float.sum(maxTemp, minTemp) / 2f;
    display();
  }

}
