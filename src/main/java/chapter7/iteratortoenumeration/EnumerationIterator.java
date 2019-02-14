package chapter7.iteratortoenumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Enumeration {
    Iterator<Object> iterator;

    EnumerationIterator(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
