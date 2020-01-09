package list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DynamicListTest<E> {

    @Test
    public void check() {

        DynamicList<String> list = new DynamicList<>(10);

        String s = "www1";
        String s1 = "www2";
        String s2 = "www3";

        list.add(s);
        list.add(s1);
        list.add(s2);
        list.check();

        int result = list.modCount - list.expectedModCount;

        assertThat(result, is(0));

    }

    @Test
    public void add() {
    }
}