package chapter4.store;

import chapter4.pizzaingredients.NYpizzaIngredientFactory;
import chapter4.pizzaingredients.PizzaIngredientFactory;
import chapter4.pizzatype.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYpizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new ChicagoStyleVeggie(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ChicagoStyleClam(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoni(ingredientFactory);
            pizza.setName("Chicago Style pepperoni Pizza");
        }
        return pizza;
    }
}
