package chapter4;

public class CaliforniaStyleVeggie extends Pizza{

    public CaliforniaStyleVeggie() {
        name = "California Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Cabbage ");
        toppings.add(" Bow ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
