package list;

import java.util.*;

public class DynamicList<E> implements Iterable<E>{

    private static int modCount = 0, expectedModCount;

    public static void main(String[] args) {
      DynamicList <Integer> list = new DynamicList<>();
      Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (modCount != expectedModCount) {
                new ConcurrentModificationException();
            }
        }
    }

   /* public E get(int index) {
           E getting = (E) list[index];
           return getting;
       }
    public void add(E value) {

        modCount++;
    }*/

   
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


}





