package chapter4;

public class NYStyleClam extends Pizza{

    public NYStyleClam() {
        name = "NY Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Clam ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
