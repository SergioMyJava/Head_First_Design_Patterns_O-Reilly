package chapter9.composite;

import java.util.Iterator;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent){throw new UnsupportedOperationException();}
    public void remove(MenuComponent menuComponent){throw new UnsupportedOperationException();}
    public String getDiscription(){throw new UnsupportedOperationException();}
    public MenuComponent getChiled(int n){throw new UnsupportedOperationException();}
    public String getName(){throw new UnsupportedOperationException();}
    public double getPrice(){throw new UnsupportedOperationException();}
    public boolean isVegetarian(){throw new UnsupportedOperationException();}
    public void print(){throw new UnsupportedOperationException();}
    public Iterator<MenuComponent> createIterator() { return null; }
}
