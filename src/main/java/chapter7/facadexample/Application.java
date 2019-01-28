package chapter7.facadexample;

public class Application {

    public static void main(String[] args){
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        TheaterLights light = new TheaterLights();
        Tuner tuner =new Tuner();
        FacadeCinema testFacade = new FacadeCinema(amp,dvd,light,tuner);
        testFacade.seeFilm("Alien 4");
    }
}
