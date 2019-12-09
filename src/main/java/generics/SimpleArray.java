package generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {
    public Object[] objects;
    private int index = 0;

    public int getSize() {
        return size;
    }

    private int size;

    public SimpleArray() {

    }

    public SimpleArray(int size) {
        this.size = size;
        this.objects = new Object[size];
    }

    public void add(T model) {
        this.objects[index++] = model;
    }

    public void set(int index, T model) {
        if (index < this.index) {
            this.objects[index] = model;
        }
    }

    public T remove(int index) {
        T res = null;

        if (index < this.index) {
            res = (T) objects[index];
            System.arraycopy(objects, index + 1, objects, index, size - 1);
            //this.objects[--this.index] = null;

        }

        return res;
    }

    public T get(int position) {

        return (T) this.objects[position];
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return objects.length > index;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) objects[index++];
            }
        };
    }
}
