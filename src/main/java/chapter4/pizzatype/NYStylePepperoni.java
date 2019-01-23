package chapter4.pizzatype;

import chapter4.pizzaingredients.PizzaIngredientFactory;

public class NYStylePepperoni extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStylePepperoni(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
