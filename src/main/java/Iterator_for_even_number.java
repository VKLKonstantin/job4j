import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_for_even_number implements Iterator {

    private int[] numbers;
    private int element;
    private int index = 0;

    public Iterator_for_even_number(int[] numbers) {
        this.numbers = numbers;
    }


    public boolean hasNext() {

        return numbers.length > index;
    }
//////////1
    public Object next() {

        if ((numbers[index]) % 2 == 0) {
            element = numbers[index % 2];
        } else {
            throw new NoSuchElementException();

        }
        index++;


        return element;

    }

    public void remove() {

    }
}
