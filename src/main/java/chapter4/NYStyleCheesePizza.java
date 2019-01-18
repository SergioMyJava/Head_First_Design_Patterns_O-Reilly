package chapter4;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Pepper ");
        toppings.add(" Cheese ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

}
