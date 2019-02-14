package chapter4.store;

import chapter4.pizzaingredients.NYpizzaIngredientFactory;
import chapter4.pizzaingredients.PizzaIngredientFactory;
import chapter4.pizzatype.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYpizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("New York Style cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new NYStyleVeggie(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new NYStyleClam(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new NYStylePepperoni(ingredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        }
        return pizza;
    }
}
