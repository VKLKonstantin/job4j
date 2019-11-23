package iterators;

import java.util.Iterator;

public class Converter {
    int i = 0;
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
    }
}
