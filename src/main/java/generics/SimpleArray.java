package generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {
    Object[] objects;
    //Object[] newArray;
    int index = 0;
    int size;

    public SimpleArray(int size) {
        this.size = size;
        this.objects = new Object[size];
    }

    public void add(T model) {
        this.objects[index++] = model;
    }

    public void set(int index, T model) {
        if (index <= objects.length - 1 && objects[index] != null) {
            this.objects[index] = model;
        }
    }

    /*public Object remove(int index) {
        if (index <= objects.length - 1) {
            newArray = new Object[size - 1];
            objects[index] = objects[objects.length - 1];
            *//*for(int i=0;i<objects.length;i++){
                if(objects[i]==null){
                    continue;
                }

                newArray[i]=objects[i];
            }*//*
            System.arraycopy(objects, 0, newArray, 0, size - 1);
        }
        return newArray;
    }*/

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
