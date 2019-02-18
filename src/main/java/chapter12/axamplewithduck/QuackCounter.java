package chapter12.axamplewithduck;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    QuackCounter(Quackable duck){
        this.duck = duck;
    }

    public void quack(){
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() { }
}
