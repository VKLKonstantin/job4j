package list;

import java.util.*;

public class DynamicList<E> implements Iterable<E> {


    public int index = 0;
    public int size;
    public static int expectedModCount, modCount = 0;
    public Object[] container;


    public DynamicList(int size) {
        this.size = size;
        this.container = new Object[size];

    }


    public static void main(String[] args) {
        DynamicList<Integer> list = new DynamicList<>(2);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next();

            if (modCount != expectedModCount) {
                new ConcurrentModificationException();
            }
        }

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
            int index;

            @Override
            public boolean hasNext() {

                return index < container.length;
            }

            @Override
            public E next() {
                index++;

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return (E) container[index];
            }
        };

    }


}





