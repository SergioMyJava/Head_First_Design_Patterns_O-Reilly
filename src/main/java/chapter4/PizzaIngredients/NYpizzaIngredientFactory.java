package chapter4.PizzaIngredients;

import chapter4.PizzaIngredients.Cheese.Cheese;
import chapter4.PizzaIngredients.Cheese.NYCheese;
import chapter4.PizzaIngredients.Clams.Clams;
import chapter4.PizzaIngredients.Clams.NYClams;
import chapter4.PizzaIngredients.Dough.Dough;
import chapter4.PizzaIngredients.Dough.NYDough;
import chapter4.PizzaIngredients.Pepperoni.NYPepperoni;
import chapter4.PizzaIngredients.Pepperoni.Pepperoni;
import chapter4.PizzaIngredients.Sauce.NYSauce;
import chapter4.PizzaIngredients.Sauce.Sauce;
import chapter4.PizzaIngredients.Veggies.Garlic;
import chapter4.PizzaIngredients.Veggies.Mushroom;
import chapter4.PizzaIngredients.Veggies.Veggies;

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
