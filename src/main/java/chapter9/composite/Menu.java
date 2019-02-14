package chapter9.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComp = new ArrayList<MenuComponent>();
    String name;
    String description;

    Menu(String name,String description){
       this.name = name;
       this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComp.add(menuComponent);
    }

    public MenuComponent getChild(int i){
        return menuComp.get(i);
    }

    public void remove(int i){
        menuComp.remove(i);
    }

    public String getName(){return name;}

    public String getDescription(){return description;}

    public void print(){
        System.out.println("\n " + getName());
        System.out.println("\n " + getDescription());

        Iterator<MenuComponent> iterator = menuComp.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return menuComp.iterator();
    }
}
