package generics;

public class UserStore extends Base implements Store<User> {

    private SimpleArray<User> users = new SimpleArray<>();

    protected UserStore(String id) {
        super(id);
    }


    @Override
    public void add(User model) {

        users.add(model);
    }

    @Override
    public boolean replace(String id, User model) {
        users.set((Integer.valueOf(id)), model);
        return true;
    }


    @Override
    public boolean delete(String id) {
        users.remove(Integer.valueOf(id));
        return true;

    }

    @Override
    public User findById(String id) {
        users.get(Integer.valueOf(id));
        return null;
    }
}
