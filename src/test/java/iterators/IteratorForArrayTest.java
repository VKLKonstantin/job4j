package iterators;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IteratorForArrayTest {

    @Test
    public void whenGetNext() {
        IteratorForArray it = new IteratorForArray(new int[][]{{1, 2}, {3, 4}});

        it.next();
        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void checkNextPosition() {
        IteratorForArray it = new IteratorForArray(new int[][]{{1, 2}, {3, 4}});

        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

}