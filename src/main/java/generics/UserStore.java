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
        return false;
    }


    //непонятно, что должен делать метод delete? почему он должен возвращать boolean
    @Override
    public boolean delete(String id) {

        return true;

    }

    @Override
    public User findById(String id) {
        return null;
    }
}
