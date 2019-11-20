package iterators;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IteratorForEvenNumberTest {
    @Test
    public void returnEvenNumber() {

        IteratorForEvenNumber it = new IteratorForEvenNumber(new int[]{4, 2, 1, 1});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(2));

    }

    @Test
    public void checkHasNext() {

        IteratorForEvenNumber it = new IteratorForEvenNumber(new int[]{4, 2, 1, 1});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(true));

    }
}