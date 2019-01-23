package chapter4.store;

import chapter4.pizzaingredients.NYpizzaIngredientFactory;
import chapter4.pizzaingredients.PizzaIngredientFactory;
import chapter4.pizzatype.*;

public class CaliforniaPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYpizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza(ingredientFactory);
            pizza.setName("California Style cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new CaliforniaStyleVeggie(ingredientFactory);
            pizza.setName("California Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new CaliforniaStyleClam(ingredientFactory);
            pizza.setName("California Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new CaliforniaStylePepperoni(ingredientFactory);
            pizza.setName("California Style pepperoni Pizza");
        }
        return pizza;
    }
}
