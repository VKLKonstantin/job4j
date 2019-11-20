package iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForArray implements Iterator {
    private int row = 0;
    private int column = 0;
    private int[][] value = {{1, 2}, {3, 4}};

    public IteratorForArray(int[][] value) {
        this.value = value;
    }

    public boolean hasNext() {
        return column <= value[row].length - 1 && row <= value.length;
    }

    public Object next() {
        if (hasNext()) {
            if (column == value[row].length - 1) {
                row++;
                column = 0;
            } else {
                column++;
            }
        } else if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return value[row][column];
    }

    public void remove() {

    }
}
