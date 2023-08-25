package headfirst.designpatterns.iterator.cafelist;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();

}
