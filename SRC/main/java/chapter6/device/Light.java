package chapter6.device;

public class Light {
    String name;

    public Light(String name){
    this.name = name;
    }

    public void on(){ System.out.println("Light ON!");  }

    public void off(){
        System.out.println("Light OFF!");
    }
}
