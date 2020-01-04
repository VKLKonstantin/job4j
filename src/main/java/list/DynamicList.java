package list;

import java.util.*;

public class DynamicList<E> implements Iterable {
    private static Object[] container;
    private static int modCount = 0, expectedModCount;

    public static void main(String[] args) {
       container = new Object[];
        Iterator<Object> iterator = container.iterator();
        expectedModCount = container.length;
        while (iterator.hasNext()) {
            iterator.next();
            if (modCount != expectedModCount) {
                new ConcurrentModificationException();
            }
        }
    }

    public void add(E value) {

        modCount++;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public E get(int index) {
        E getting = (E) container[index];
        return getting;
    }
}





