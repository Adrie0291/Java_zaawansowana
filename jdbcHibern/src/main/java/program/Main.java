package program;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserRepository ur = new UserRepository();
        //1. Dodanie pojedynczo użytkwoników do bazy
        //  ur.saveUser(new User("Waldemar","pilka9", Language.FR));
        //   ur.saveUser(new User("Wanda i Banda","brakhasla", Language.ES));
        //ur.saveUser(new User("IGa","192921", Language.ES));
        // ur.saveUser(new User("Marowicki","020202020", Language.PL));

        // 3. Metoda update, działa, ale gdy normalnei coś edytuejmy to wczytuejmy dane. zmieniamy i zapisujemy.
        // Nikt ręcznie nie tworzy tego od nowa . 1. Wczytanie listy 2. Zmiana danych 3. Zapisanie danych
        //User u = new User(12, "keeeeeee","innehaslo",Language.GE); // nie znam na teraz metody wczytywani danych z bazy, dlatego w taki sposób
        //ur.updateUser(u);
        List<User> userByLangauge = ur.findUsersByLanguage(Language.GE);
        //userByLangauge.forEach(u -> System.out.println(u));
        userByLangauge.forEach(System.out::println); // krótszy zapis lambdy; tzw.referenacja do metody,

        //2. Usunięcie usera na podstawie jego nr ID
        //ur.deleteUser(3);
        ur.closeConnection();
    }
}