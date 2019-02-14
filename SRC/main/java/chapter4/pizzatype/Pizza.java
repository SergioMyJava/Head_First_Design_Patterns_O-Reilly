package chapter4.pizzatype;

import chapter4.pizzaingredients.cheese.Cheese;
import chapter4.pizzaingredients.clams.Clams;
import chapter4.pizzaingredients.dough.Dough;
import chapter4.pizzaingredients.pepperoni.Pepperoni;
import chapter4.pizzaingredients.sauce.Sauce;
import chapter4.pizzaingredients.veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
