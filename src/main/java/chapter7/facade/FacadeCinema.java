package chapter7.facade;

public class FacadeCinema {
        Amplifier amp;
        DvdPlayer dvd;
        TheaterLights light;
        Tuner tuner;
    public FacadeCinema(Amplifier amp,DvdPlayer dvd,TheaterLights light,Tuner tuner){
        this.amp = amp;
        this.dvd = dvd;
        this.light = light;
        this.tuner = tuner;
    }

    public void seeFilm(String name){
        light.dim();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(15);
        dvd.on();
        dvd.play(name);
    }
}
