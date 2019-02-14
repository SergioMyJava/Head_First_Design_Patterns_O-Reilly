package chapter4.pizzaingredients;

import chapter4.pizzaingredients.cheese.Cheese;
import chapter4.pizzaingredients.cheese.ChicagoCheese;
import chapter4.pizzaingredients.clams.Clams;
import chapter4.pizzaingredients.dough.Dough;
import chapter4.pizzaingredients.pepperoni.Pepperoni;
import chapter4.pizzaingredients.sauce.Sauce;
import chapter4.pizzaingredients.veggies.Garlic;
import chapter4.pizzaingredients.veggies.Mushroom;
import chapter4.pizzaingredients.veggies.Veggies;

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
