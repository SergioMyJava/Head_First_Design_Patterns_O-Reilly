package chapter9.menuwithiterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
        MenuItem[] menuItems;
        int position;

    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.menuItems = items;
        position = Calendar.DAY_OF_WEEK%2;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
        return false;}
        else
            return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems [position];
        position = position+2;
        return menuItem;
    }

    public void remove(){
        throw new UnsupportedOperationException( "Alternating Diner Menu Iterator does not support remove()"); }
}
