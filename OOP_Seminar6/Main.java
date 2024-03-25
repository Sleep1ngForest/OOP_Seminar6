package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserDataManager udm = new UserDataManager();
        udm.report(user);
        udm.save(user);
    }
}