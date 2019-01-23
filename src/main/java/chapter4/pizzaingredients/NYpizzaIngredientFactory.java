package chapter4.pizzaingredients;

import chapter4.pizzaingredients.cheese.Cheese;
import chapter4.pizzaingredients.cheese.NYCheese;
import chapter4.pizzaingredients.clams.Clams;
import chapter4.pizzaingredients.clams.NYClams;
import chapter4.pizzaingredients.dough.Dough;
import chapter4.pizzaingredients.dough.NYDough;
import chapter4.pizzaingredients.pepperoni.NYPepperoni;
import chapter4.pizzaingredients.pepperoni.Pepperoni;
import chapter4.pizzaingredients.sauce.NYSauce;
import chapter4.pizzaingredients.sauce.Sauce;
import chapter4.pizzaingredients.veggies.Garlic;
import chapter4.pizzaingredients.veggies.Mushroom;
import chapter4.pizzaingredients.veggies.Veggies;

public class NYpizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Mushroom() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Clams createClam() {
        return new NYClams();
    }
}
