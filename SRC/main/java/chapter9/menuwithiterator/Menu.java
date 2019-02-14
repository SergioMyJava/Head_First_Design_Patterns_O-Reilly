package chapter9.menuwithiterator;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
