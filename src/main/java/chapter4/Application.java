package chapter4;

import chapter4.pizzatype.Pizza;
import chapter4.store.NYPizzaStore;
import chapter4.store.PizzaStore;

public class Application {

    public static void main(String[] args){
        PizzaStore myPizza = new NYPizzaStore();
        Pizza pizza = myPizza.orderPizza("veggie");

        System.out.print("I'am ordered " + pizza.getName());
    }
}
