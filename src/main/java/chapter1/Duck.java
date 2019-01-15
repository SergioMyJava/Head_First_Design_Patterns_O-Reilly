package chapter1;

public abstract class Duck implements QuackBehavior,FlyBehavior{
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    Duck(){}

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void setPerformQuack(){}

    public void setPerformFly(){}

    public void swim(){
        System.out.print("All duck swim? even decoys. ");
    }
}
