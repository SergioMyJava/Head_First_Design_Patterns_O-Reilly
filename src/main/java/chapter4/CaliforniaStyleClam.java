package chapter4;

public class CaliforniaStyleClam extends Pizza{

    public CaliforniaStyleClam() {
        name = "California Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Clam ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}

