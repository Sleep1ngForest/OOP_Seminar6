package homework;

import homework.utils.UserOperations;

public class UserDataManager {
    private final UserOperations userOperations = new UserOperations();

    public void save(User user){
        userOperations.save(user);
    }
    public void report(User user){
        userOperations.report(user);
    }
}
