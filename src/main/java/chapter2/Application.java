package chapter2;

public class Application {

    public  static void main(String[] args) {
        Subject test = new WeatherData();
        Observer testWeather = new StatisticsDisplay(test);
        ((WeatherData) test).setMeserments(-20, 60, 30.4f);
        ((StatisticsDisplay) testWeather).display();

        WetherDataUtil subjectUtil = new WetherDataUtil();
        StatisticsDisplayUtil observerUtil = new StatisticsDisplayUtil(subjectUtil);
        ForecastDisplay forecastDisplayTest = new ForecastDisplay(subjectUtil);
        subjectUtil.setMeasurements(12,55,32.4f);



    }
}
