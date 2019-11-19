import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Iterator_for_even_numberTest {
    @Test
    public void return_even_number() {

        Iterator_for_even_number it = new Iterator_for_even_number(new int[]{4, 2, 1, 1});

        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(2));

    }

    @Test
    public void check_hasNext() {

        Iterator_for_even_number it = new Iterator_for_even_number(new int[]{4, 2, 1, 1});

        it.next();
        boolean result = it.hasNext();

        assertThat(result, is(true));

    }
}