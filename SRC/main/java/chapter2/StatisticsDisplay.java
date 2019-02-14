package chapter2;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity" );
    }
}
