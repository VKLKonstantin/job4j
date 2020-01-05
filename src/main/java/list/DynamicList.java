package list;

import java.util.*;

public class DynamicList<E> implements Iterable<E>{
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
    public Iterator <E>iterator() {
        return new Iterator<E>()
        {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };

    }

    public E get(int index) {
        E getting = (E) container[index];
        return getting;
    }
}





