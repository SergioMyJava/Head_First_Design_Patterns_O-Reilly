package chapter12.axamplewithduck;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.getClass() + " just quacked.");
    }
}
