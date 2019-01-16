package chapter2;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void display() {
        System.out.print("The temperature is a " + temperature + " ,the humidity is " + humidity );
    }
}
