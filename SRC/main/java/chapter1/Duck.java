package chapter1;

public abstract class Duck{
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

    public void setPerformQuack(QuackBehavior br){
        quackBehavior = br;
    }

    public void setPerformFly(FlyBehavior br){
        flyBehavior = br;
    }

    public void swim(){
        System.out.print("All duck swim? even decoys. ");
    }
}
