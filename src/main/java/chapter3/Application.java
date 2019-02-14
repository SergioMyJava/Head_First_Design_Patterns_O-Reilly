package chapter3;

public class Application {

    public static void main(String[] args){
        Beverage espresso = new Espresso();
        System.out.println("Вы заказали " + espresso.getDescription() + " с вас $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println("Вы заказали " +  houseBlend.getDescription() + " с вас $" + houseBlend.cost());

        Beverage espresso2 = new Espresso();

        espresso2 = new Soy(espresso2);
        espresso2 = new Mocha(espresso2);
        System.out.println("Вы заказали " + espresso2.getDescription() + " с вас $" + espresso2.cost());

    }
}
