package chapter4;

public class NYStyleVeggie extends Pizza{

    public NYStyleVeggie() {
        name = "NY Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Pepper ");
        toppings.add(" Bow ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
