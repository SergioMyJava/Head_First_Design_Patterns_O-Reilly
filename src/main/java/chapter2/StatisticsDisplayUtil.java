package chapter2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplayUtil implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public StatisticsDisplayUtil(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                +  "F degrees and " + humidity + "% humidity");
    }

    public void update(Observable o, Object arg) {
     if(o instanceof WetherDataUtil){
         WetherDataUtil wetherDataUtil = (WetherDataUtil) o;     // мыпривели полученный объект к WetherDataUtil но можно было и так this.temperature = ((WetherDataUtil) o).getTemperature();
         this.temperature = wetherDataUtil.getTemperature();
         this.humidity = wetherDataUtil.getHumidity();
         display();
     }
    }
}
