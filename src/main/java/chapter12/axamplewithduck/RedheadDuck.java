package chapter12.axamplewithduck;

public class RedheadDuck implements Quackable {
    Observable observable;

    RedheadDuck(){observable = new Observable(this);}

    @Override
    public void quack() {
        System.out.println("Quack");
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
