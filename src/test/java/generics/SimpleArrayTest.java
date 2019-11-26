package generics;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleArrayTest {

    @Test
    public void additionElement() {
        SimpleArray array = new SimpleArray(5);
        String d = "first";

        array.add(d);
        String result = (String) array.objects[0];

        assertThat(result, is("first"));
    }

    @Test
    public void replaceElement() {
        SimpleArray array = new SimpleArray(5);
        String d1 = "first";
        String d2 = "second";

        array.add(d1);
        array.add(d2);
        array.set(0, d2);
        array.set(1, d1);
        String result = (String) array.objects[0];

        assertThat(result, is("second"));
    }

    @Test
    public void deleteElement() {
        SimpleArray array = new SimpleArray(4);
        String d1 = "first";
        String d2 = "second";
        String d3 = "third";
        String d4 = "fourth";

        array.add(d1);
        array.add(d2);
        array.add(d3);
        array.add(d4);

        array.remove(0);
        String result = (String) array.get(0);

        assertThat(result, is("second"));
    }

    @Test
    public void gettingElement() {
        SimpleArray array = new SimpleArray(5);
        String d1 = "first";
        String d2 = "second";
        array.add(d1);
        array.add(d2);

        String result = (String) array.get(1);

        assertThat(result, is("second"));
    }


}