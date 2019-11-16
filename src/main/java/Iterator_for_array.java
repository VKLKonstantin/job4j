import java.util.Iterator;

public class Iterator_for_array implements Iterator {


    private int[][] value = {{1, 2}, {3, 4}};
    private int lineIndex = 0;
    private int columnIndex = 0;

    public Iterator_for_array(int[][] value)  {
        this.value = value;
    }


    public boolean hasNext() {
        return lineIndex < value.length&&columnIndex >=value[lineIndex].length;
    }

    public Object next() {
        int element = value[lineIndex][columnIndex];
        if (hasNext()) {
            columnIndex++;}
            else if(!hasNext()){
                columnIndex = 0;
                lineIndex++;
        }
        return element;

    }

    public void remove() {

    }


}
