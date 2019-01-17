package chapter3;

public class Espresso extends Baverage {

    Espresso(){
        description = "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
