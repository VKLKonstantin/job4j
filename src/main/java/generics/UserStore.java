package generics;

public class UserStore implements Store<User> {

    private SimpleArray<User> users = new SimpleArray<>();



    @Override
    public void add(User model) {
        users.add(model);
    }

    @Override
    public boolean replace(String id, User model) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public User findById(String id) {
        return null;
    }
}
