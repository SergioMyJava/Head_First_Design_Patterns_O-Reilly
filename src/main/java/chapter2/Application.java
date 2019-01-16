package chapter2;

public class Application {

    public  static void main(String[] args) {
        Subject test = new WeatherData();
        Observer testWeather = new StatisticsDisplay(test);
        ((WeatherData) test).setMeserments(-20, 60, 745);
        ((StatisticsDisplay) testWeather).display();
    }

}
