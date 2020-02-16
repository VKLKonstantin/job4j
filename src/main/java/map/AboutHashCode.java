package map;

import java.util.Objects;

public class AboutHashCode {
    public String first;
    public int second;


    public AboutHashCode(String first, int second) {
        this.first = first;
        this.second = second;
    }

//вычисление хэш-кода для полей first и second
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

//содержание метода hash
   /* public static int hash(Object... values) {
        return Arrays.hashCode(values);
    }*/



   //содержание метода hashCode
    /*
    если значение переменной равно null, то значение хэш-функции равно 0.
    для других случаев значение хэш-функции равно 31*1+хэш-код.
    Множитель   31   выбран   потому,   что   является   простым
нечетным числом. Если бы это было четное число и при умножении произошло переполнение,
информация была бы потеряна, поскольку умножение числа на 2 равнозначно его арифметическому
сдвигу. (из effective java, только там множитель 37)
Если честно, то про множитель не понял...
     */


    /*public static int hashCode(Object a[]) {
        if (a == null)
            return 0;

        int result = 1;

        for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }*/
}
