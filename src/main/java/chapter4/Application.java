package chapter4;

public class Application {

    public static void main(String[] args){
        PizzaStore myPizza = new CaliforniaPizzaStore();
        Pizza pizza = myPizza.orderPizza("cheese");

        System.out.print("I'am ordered " + pizza.getName());
    }
}
