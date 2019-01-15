package chapter1;

public class MallardDuck extends Duck {

    MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }

    public void fly() {}

    public void quack() {}
}
