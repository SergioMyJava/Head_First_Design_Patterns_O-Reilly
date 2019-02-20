package chapter8.caffeinebeverage;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brew Tea .");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and lemon .");
    }
}
