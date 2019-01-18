package chapter4;

public class ChicagoStyleClam extends Pizza{

    public ChicagoStyleClam() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add(" Clam ");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

}
