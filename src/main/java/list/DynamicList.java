package list;

import java.util.*;

public class DynamicList<E> implements Iterable<E> {

    public static int modCount = 0, index = 0, size, expectedModCount;
    public static Object[] container;


    public DynamicList(int size) {
        this.size = size;
        this.container = new Object[size];

    }


    public int check() {
        DynamicList<Integer> list = new DynamicList<>(2);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            expectedModCount++;
            if (list.modCount != expectedModCount) {
                new ConcurrentModificationException();
            }
        }
        return expectedModCount;
    }


    public E get(int index) {

        return (E) this.container[index];
    }

    public void add(E value) {
        if (container.length < size) {
            this.container[index++] = value;
            modCount++;
        } else {
            System.arraycopy(container, 0, container, 0, size++);
            modCount++;
        }
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {

                return container.length > index;
            }

            @Override
            public E next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) container[index++];
            }
        };

    }


}





