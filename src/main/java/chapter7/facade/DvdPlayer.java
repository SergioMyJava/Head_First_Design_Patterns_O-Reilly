package chapter7.facade;

public class DvdPlayer {

    public void on() {
        System.out.println("Dvd Player is ON!");
    }

    public void off() {
        System.out.println("Dvd Player is OFF!"); }

    public void play(String movie){
        System.out.println("Today we will see " + movie);
    }
}
