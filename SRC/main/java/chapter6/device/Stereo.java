package chapter6.device;


public class Stereo {
    String name;

    public Stereo(String name){
        this.name = name;
    }

    public void on(){
        System.out.println("Stereo is ON! ");
    }

    public void off(){
        System.out.println("Stereo Off! ");
    }

    public void setCD(){
        System.out.println("CD changer is ON.");
    }

    public void setVolume(int Vol){
        System.out.println("Sound volume " + Vol);
    }

    public void setDvd(){
        System.out.println( " DVD is ON " );
    }

    public void setRadio(){
        System.out.println(" Radio is on ");
    }
}
