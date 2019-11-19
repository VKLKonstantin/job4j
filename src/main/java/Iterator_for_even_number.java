import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_for_even_number implements Iterator {

    private int[] numbers;
    private int element;
    private int index = -1;

    public Iterator_for_even_number(int[] numbers) {
        this.numbers = numbers;
    }


    public boolean hasNext() {

        return numbers.length > index;
    }

    public Object next() {
        index++;
        if ((numbers[index]) % 2 == 0) {
            element = numbers[index];
        } else {
            throw new NoSuchElementException();

        }



        return element;

    }

    public void remove() {

    }
}
