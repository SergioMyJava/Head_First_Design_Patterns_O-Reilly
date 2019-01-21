package chapter4.PizzaIngredients;

import chapter4.PizzaIngredients.Cheese.Cheese;
import chapter4.PizzaIngredients.Cheese.ChicagoCheese;
import chapter4.PizzaIngredients.Clams.Clams;
import chapter4.PizzaIngredients.Dough.Dough;
import chapter4.PizzaIngredients.Pepperoni.Pepperoni;
import chapter4.PizzaIngredients.Sauce.Sauce;
import chapter4.PizzaIngredients.Veggies.Garlic;
import chapter4.PizzaIngredients.Veggies.Mushroom;
import chapter4.PizzaIngredients.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Mushroom() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
