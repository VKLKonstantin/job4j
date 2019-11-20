package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForEvenNumber implements Iterator {

    private int[] numbers;
    private int element;
    private int index = -1;

    public IteratorForEvenNumber(int[] numbers) {

        this.numbers = numbers;
    }

    public boolean hasNext() {
        if ((numbers[index + 1]) % 2 != 0) {
            throw new NoSuchElementException();
        }
        return numbers.length > index;
    }

    public Object next() {
        index++;
        if (numbers.length > index) {
            if ((numbers[index]) % 2 == 0) {
                element = numbers[index];
            } else {
                throw new NoSuchElementException();
            }
        } else if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return element;
    }

    public void remove() {

    }
}
