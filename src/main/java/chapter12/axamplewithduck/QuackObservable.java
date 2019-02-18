package chapter12.axamplewithduck;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
