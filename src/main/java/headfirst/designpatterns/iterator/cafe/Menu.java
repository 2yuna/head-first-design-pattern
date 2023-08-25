package headfirst.designpatterns.iterator.cafe;

import java.util.Iterator;

public interface Menu {

    Iterator<MenuItem> createIterator();

}
