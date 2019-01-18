package chapter4;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Cheese ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
