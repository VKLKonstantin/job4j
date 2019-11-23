package generics;

import java.util.Iterator;

public class SimpleArray<T> implements Iterable<T> {
    Object[] objects;
    int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public void add(T model) {
        this.objects[index++] = model;
    }

    public void set(int index, T model) {
        this.objects[index] = model;
    }

    public void remove(int index) {
        if (index <= objects.length - 1) {
            for (int i = 0; i < objects.length-2; i++) {
                objects[index + 1 + i] = objects[index + i];
            }
        }
    }
    public T get(int position) {

        return (T) this.objects[position];
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
