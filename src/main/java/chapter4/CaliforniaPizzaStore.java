package chapter4;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        CaliforniaStyleCheesePizza pizza;
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        }


        else if(type.equals("pepperoni")){
            return new CaliforniaStylePepperoni();
        }

        else if(type.equals("clam")){
            return new CaliforniaStyleClam();
        }

        else if(type.equals("veggie")){
            return new CaliforniaStyleVeggie();
        }
        else return null;
    }
}
