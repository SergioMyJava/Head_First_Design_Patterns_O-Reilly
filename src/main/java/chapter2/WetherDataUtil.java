package chapter2;

import java.util.Observable;

public class WetherDataUtil extends Observable {
    private float temperature;
    private float humidity;
    private float presure;

    public void mesurmentsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float presure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.presure = presure;
    mesurmentsChanged();
    }
     public float getTemperature(){
        return temperature;
     }

     public float getHumidity(){
        return humidity;
     }

     public float getPresure(){
        return presure;
     }
}
