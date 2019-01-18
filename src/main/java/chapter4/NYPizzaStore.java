package chapter4;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (type.equals("pepperoni")){
            return new NYStylePepperoni();
        }

        else if (type.equals("clam")) {
            return new NYStyleClam();
        }

        if (type.equals("veggie")) {
            return new NYStyleVeggie();
        } else return null;
    }

}
