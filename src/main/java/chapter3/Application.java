package chapter3;

public class Application {

    public static void main(String[] args){
        Baverage espresso = new Espresso();
        System.out.println("Вы заказали " + espresso.getDiskription() + " с вас $" + espresso.coast());
        Baverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println("Вы заказали " +  houseBlend.getDiskription() + " с вас $" + houseBlend.coast());
    }
}
