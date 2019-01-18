package chapter4;

public class ChicagoStylePepperoni extends Pizza{

    public ChicagoStylePepperoni() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Pepper ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
