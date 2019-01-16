package chapter2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList arrayObservers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData(){
        arrayObservers = new ArrayList();
    }

    public void addObserver(Observer observer) {
        arrayObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = arrayObservers.indexOf(observer);
        if(i>=0){
            arrayObservers.remove(i);
        }
    }

    public void notifyObserver() {
        for(int i=0;i<arrayObservers.size();i++){
            Observer o=(Observer)arrayObservers.get(i);
            o.update(temperature,humidity);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeserments(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();                                                      // почему бы нам тут не вызывать метод notifyObserver()
    }                                                                               // зачем промежуточный метод measurementsChanged()
}
