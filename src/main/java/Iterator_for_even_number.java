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
if((numbers[index+1]) % 2 != 0){
    throw new NoSuchElementException();
}
        return numbers.length > index;
    }

    public Object next() {
        index++;
        if(numbers.length > index) {
            if ((numbers[index]) % 2 == 0) {
                element = numbers[index];
            } else {
                throw new NoSuchElementException();

            }
        }
        else if(!hasNext()){
            throw new NoSuchElementException();
        }
        return element;

    }

    public void remove() {

    }
}
