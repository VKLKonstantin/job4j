package list;


import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class DynamicListNode<E> {
    //implements Iterable
    /*private int size;
    private Node<E> first;
    private static int expectedModCount = 0;

    Iterator<E> iterator1 = first.iterator();

        while(iterator1.hasNext())

    {
        iterator1.next();
        expectedModCount++;
        if (size != expectedModCount) {
            new ConcurrentModificationException();
        }
    }

    public void add(E data) {
        Node<E> newElement = new Node<E>(data);
        newElement.next = this.first;
        this.first = newElement;
        size++;
    }

    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.data;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    private static class Node<E> {

        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }

        public Node() {

        }
    }*/
}
