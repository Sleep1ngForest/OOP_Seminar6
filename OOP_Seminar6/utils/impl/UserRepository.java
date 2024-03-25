package homework.utils.impl;

import homework.User;

public interface UserRepository {
    void save(User user);
    void report(User user);
}
