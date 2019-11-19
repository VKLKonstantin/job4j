import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Iterator_for_even_numberTest {

    @Test
    public void return_even_number() {

        Iterator_for_even_number it = new Iterator_for_even_number(new int[]{2, 6, 3, 6});

        it.next();
      //  it.next();
        int result = (Integer) it.next();

        assertThat(result, is(6));

    }
    @Test
    public void check_hasNext() {

        Iterator_for_even_number it = new Iterator_for_even_number(new int[]{2, 6, 3, 6});

        it.next();
        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(3));

    }
}