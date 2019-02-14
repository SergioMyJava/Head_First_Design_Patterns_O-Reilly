package chapter4.pizzaingredients;

import chapter4.pizzaingredients.cheese.Cheese;
import chapter4.pizzaingredients.clams.Clams;
import chapter4.pizzaingredients.dough.Dough;
import chapter4.pizzaingredients.pepperoni.Pepperoni;
import chapter4.pizzaingredients.sauce.Sauce;
import chapter4.pizzaingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
