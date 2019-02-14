package chapter4.pizzatype;

import chapter4.pizzaingredients.PizzaIngredientFactory;

public class NYStyleClam extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStyleClam(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
