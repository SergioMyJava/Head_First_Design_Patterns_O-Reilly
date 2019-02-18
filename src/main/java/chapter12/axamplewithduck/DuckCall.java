package chapter12.axamplewithduck;

public class DuckCall implements Quackable {
    Observable observable;

    DuckCall(){observable = new Observable(this);}

    @Override
    public void quack() {
        System.out.println("Kwak"); notifyObservers();}

        public void registerObserver(Observer observer) {
            observable.registerObserver(observer);
        }

        public void notifyObservers() {
            observable.notifyObservers();
        }
    }

