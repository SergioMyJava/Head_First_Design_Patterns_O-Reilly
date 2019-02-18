package chapter12.axamplewithduck;

public class RubberDuck implements Quackable {
    Observable observable;

    RubberDuck(){ observable = new Observable(this);}

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
