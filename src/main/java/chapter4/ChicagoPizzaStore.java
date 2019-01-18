package chapter4;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }


        else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoni();
        }

        else if(type.equals("clam")){
            return new ChicagoStyleClam();
        }

        else if(type.equals("veggie")){
            return new ChicagoStyleVeggie();
        }
        else return null;
    }
}
