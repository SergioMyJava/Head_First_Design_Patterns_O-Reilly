package chapter9;

import chapter9.menuwithiterator.*;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(dinerMenu);
        menu.add(pancakeHouseMenu);
        menu.add(cafeMenu);

        Waitress nill = new Waitress(menu);
        nill.printMenu();
    }
}
