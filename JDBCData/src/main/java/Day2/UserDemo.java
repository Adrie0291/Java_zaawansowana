package Day2;

import java.util.List;

public class UserDemo {
    public static void main(String[] args) {
        UserRepository ur = new UserRepository();
       /* 1. Dodawanie użytkowników
       ur.saveUser(new User("Mirosław","Bakowski",Language.ES));

        ur.saveUser(new User("Katarzyna","Krajewska",Language.PL));
        ur.saveUser(new User("Helena","Gorski",Language.FR));
        ur.saveUser(new User("Wacław","Lekocki",Language.ES));
        */

        // 2. Usuwanie rekordu: ur.deleteUser(1);
        /* 3. UPDATE
        User userUpdate = new User(4, "Kacper", "Lekocki2", Language.DE);
        ur.updateUser(userUpdate);
       */

        List<User> usersByLanguage = ur.findUsersByLanguage(Language.PL);
        // LAMBDA: usersByLanguage.forEach(user -> System.out.println(user));
        usersByLanguage.forEach(System.out::println);
        ur.closeConnection();


    }
}
