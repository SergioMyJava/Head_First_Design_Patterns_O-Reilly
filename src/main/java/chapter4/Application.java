package chapter4;

import chapter4.PizzaType.Pizza;
import chapter4.Store.CaliforniaPizzaStore;
import chapter4.Store.NYPizzaStore;
import chapter4.Store.PizzaStore;

public class Application {

    public static void main(String[] args){
        PizzaStore myPizza = new NYPizzaStore();
        Pizza pizza = myPizza.orderPizza("cheese");

        System.out.print("I'am ordered " + pizza.getName());
    }
}
