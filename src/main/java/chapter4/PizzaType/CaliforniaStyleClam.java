package chapter4.PizzaType;

import chapter4.PizzaIngredients.PizzaIngredientFactory;

public class CaliforniaStyleClam extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CaliforniaStyleClam(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

