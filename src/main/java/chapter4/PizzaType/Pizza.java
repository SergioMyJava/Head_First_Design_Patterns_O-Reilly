package chapter4.PizzaType;

import chapter4.PizzaIngredients.Cheese.Cheese;
import chapter4.PizzaIngredients.Clams.Clams;
import chapter4.PizzaIngredients.Dough.Dough;
import chapter4.PizzaIngredients.Pepperoni.Pepperoni;
import chapter4.PizzaIngredients.Sauce.Sauce;
import chapter4.PizzaIngredients.Veggies.Veggies;

import java.util.ArrayList;

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
