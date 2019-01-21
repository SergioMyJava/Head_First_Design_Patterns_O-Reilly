package chapter4.PizzaIngredients;

import chapter4.PizzaIngredients.Cheese.Cheese;
import chapter4.PizzaIngredients.Clams.Clams;
import chapter4.PizzaIngredients.Dough.Dough;
import chapter4.PizzaIngredients.Pepperoni.Pepperoni;
import chapter4.PizzaIngredients.Sauce.Sauce;
import chapter4.PizzaIngredients.Veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
