package chapter9.menuwithiterator;

import java.awt.*;
import java.util.Iterator;

 public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) { //откуда сдесь position возмется, по коду он всегда = 0;
            return false;                                          //а метод next вызывается в коде после hasNext
        } else {
            return true;
        }
    }
}

