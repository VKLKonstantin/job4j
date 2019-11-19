import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_for_array implements Iterator {


    private int row = 0;
    private int column = 0;
    private int[][] value = {{1, 2}, {3, 4}};

    public Iterator_for_array(int[][] value) {

        this.value = value;
    }


    public boolean hasNext() {

        return column < value[row].length - 1&&row <= value.length - 1;
    }

    public Object next() {

        if (hasNext()) {
            column++;
        } else if (!hasNext()) {
            if (row < value.length - 1) {
                row++;
                column = 0;
            } else {
                throw new NoSuchElementException();
            }


        }

        //column <= value[row].length ||row <= value.length
       /* if (column < value[row].length) {
            column++;
        } else if (column == value[row].length) {

            row++;
            column = 0;
        } else if (row > value.length) {
            throw new NoSuchElementException();
        }*/
        return value[row][column];
    }

    public void remove() {

    }


}
