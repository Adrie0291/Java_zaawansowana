package program;

public class Main {
    public static void main(String[] args) {
        UserRepository ur = new UserRepository();
        ur.saveUser(new User("Waldemar","pilka9", Language.FR));
        //ur.saveUser(new User("IGa","192921", Language.ES));
        ur.closeConnection();
    }
}