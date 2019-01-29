package chapter9.menuwithiterator;

import java.awt.*;
import java.util.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();//не знаю что с этим делать
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " , " );
            System.out.print(menuItem.getPrice() + " -- ");//этот метод в книге я так понимаю не реализован и необходимо из масисва достать цену я правильн понимаю?
            System.out.println(menuItem.getDescription());//этих методов нету я так понимаю но я не понимаю как достать diskription
        }                                                  //из menuItem поскольку не пойму это массив что за тип объекта  MenuItem
    }
}
