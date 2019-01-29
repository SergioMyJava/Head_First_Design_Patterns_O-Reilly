package chapter9.menuwithiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
