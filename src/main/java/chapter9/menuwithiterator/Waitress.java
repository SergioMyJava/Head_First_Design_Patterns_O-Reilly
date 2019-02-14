package chapter9.menuwithiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu>  menu;
    int namberMenu = 0;

    public Waitress(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menu.iterator();
        while (menuIterator.hasNext()){
            namberMenu++;
            System.out.println("Menu" + namberMenu);
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " , " );
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
