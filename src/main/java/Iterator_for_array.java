import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iterator_for_array implements Iterator {


    private int row_Index = 0;
    private int column_Index = -1;
    private int[][] value = {{1, 2}, {3, 4}};

    public Iterator_for_array(int[][] value) {

        this.value = value;
    }


    public boolean hasNext() {
        return column_Index <= value[row_Index].length && row_Index <= value.length;
    }

    public Object next() {

        if (column_Index < value[row_Index].length) {
            column_Index++;
        } else if (column_Index == value[row_Index].length) {

            row_Index++;
            column_Index = 0;
        } else if (row_Index > value.length) {
            throw new NoSuchElementException();
        }
        return value[row_Index][column_Index];
    }

    public void remove() {

    }


}
