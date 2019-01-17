package chapter2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WetherDataUtil) {
            WetherDataUtil weatherData =(WetherDataUtil) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPresure();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + currentPressure + " pressure");
    }
}
