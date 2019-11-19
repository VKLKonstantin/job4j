import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Iterator_for_arrayTest {

    @Test
    public void whenGetNext() {
        Iterator_for_array it = new Iterator_for_array(new int[][]{{1, 2}, {3, 4}});

        it.next();
        it.next();
        int result = (Integer) it.next();

        assertThat(result, is(4));
    }

    @Test
    public void checkNextPosition() {
        Iterator_for_array it = new Iterator_for_array(new int[][]{{1, 2}, {3, 4}});

        boolean result = it.hasNext();

        assertThat(result, is(true));
    }

}