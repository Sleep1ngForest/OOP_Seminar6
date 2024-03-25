package homework.utils;

import homework.User;
import homework.utils.impl.UserRepository;

public class UserOperations implements UserRepository {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
