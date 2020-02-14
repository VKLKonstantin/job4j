package map;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ModelUser {
    public static final class User {
        public String name;
        public int children;
        public Calendar birthday;

        public User(String name, int children, Calendar birthday) {
            this.name = name;
            this.children = children;
            this.birthday = birthday;
        }


        @Override
        public int hashCode() {
            return Objects.hash(name, children, birthday);
        }

        /*@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return children == user.children &&
                    Objects.equals(name, user.name) &&
                    Objects.equals(birthday, user.birthday);
        }*/

    }


    @Test
    public void maps() {
        Calendar calendar = new GregorianCalendar(1993, Calendar.JANUARY, 25);

        User first = new User("Kostya", 0, calendar);
        User second = new User("Kostya", 0, calendar);

        Map<User, Object> map = new HashMap<>();
        map.put(first, 1);
        map.put(second, 2);
        System.out.println(map);

    }


}
