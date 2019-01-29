package chapter9;

import chapter9.menuwithiterator.DinerMenu;
import chapter9.menuwithiterator.PancakeHouseMenu;
import chapter9.menuwithiterator.Waitress;

public class Application {
    public static void main(String[] args){
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress nill = new Waitress(pancakeHouseMenu,dinerMenu);
        nill.printMenu();
    }
}
