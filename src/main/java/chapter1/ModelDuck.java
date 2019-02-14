package chapter1;

public class ModelDuck extends Duck{

    ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() { System.out.print("I'am a model. "); }
}
