package map;

import java.util.Calendar;

public class ModelUser {
    String name;
    int children;
    Calendar birthday;

    public ModelUser(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }
}
