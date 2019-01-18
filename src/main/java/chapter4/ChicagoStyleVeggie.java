package chapter4;

public class ChicagoStyleVeggie extends Pizza{

    public ChicagoStyleVeggie() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Cabbage ");
        toppings.add(" Bow ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
