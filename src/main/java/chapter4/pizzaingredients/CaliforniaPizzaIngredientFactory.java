package chapter4.pizzaingredients;

import chapter4.pizzaingredients.cheese.CaliforniaCheese;
import chapter4.pizzaingredients.cheese.Cheese;
import chapter4.pizzaingredients.clams.Clams;
import chapter4.pizzaingredients.dough.CaliforniaDough;
import chapter4.pizzaingredients.dough.Dough;
import chapter4.pizzaingredients.pepperoni.Pepperoni;
import chapter4.pizzaingredients.sauce.CaliforniaSouce;
import chapter4.pizzaingredients.sauce.Sauce;
import chapter4.pizzaingredients.veggies.Garlic;
import chapter4.pizzaingredients.veggies.Mushroom;
import chapter4.pizzaingredients.veggies.Veggies;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {


    @Override
    public Dough createDough() {
        return new CaliforniaDough();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaSouce();
    }

    @Override
    public Cheese createCheese() {
        return new CaliforniaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Mushroom()};
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
