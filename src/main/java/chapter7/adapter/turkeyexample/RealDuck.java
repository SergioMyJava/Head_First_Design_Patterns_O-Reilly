package chapter7.adapter.turkeyexample;

public class RealDuck implements Duck {
    @Override
    public void squack() {
        System.out.println("Squack squack");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly! I believe I can touch the sky! ");
    }
}
