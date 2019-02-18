package chapter12.axamplewithduck;

public class Goose implements OrdinaryGoose {
    Observable observable;

    public void honk() {
        System.out.println("Honk");
    }

}
