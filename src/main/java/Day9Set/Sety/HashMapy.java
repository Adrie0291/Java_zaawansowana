package Day9Set.Sety;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapy {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("abc@gmail.com", new User("Adam", 39));
        users.put("rober@gmail.com", new User("Robert", 7));
        users.put("stefan@o2.pl", new User("Stefan", 76));
        users.put("abc@gmail.com", new User("Malgosia", 19));
        users.put("michal@interia.pl", new User("Michal", 28));

        System.out.println(users);
        System.out.println(users.get("stefan@o2.pl")); //
        User user4 = new User("Stefan", 76);

        System.out.println(users.containsKey("michal@interia.pl"));
        System.out.println(users.containsValue(new User("Stefan", 76)));

        /* Map nie mo¿na bezpœrednio przegl¹dac. Klucze s¹ unikatowe.
        for (User user :users){
         */
        // przegl¹danie kluczy umo¿liwia przegl¹danie wartosci
        for (String key : users.keySet()) {
            System.out.println(key + " = " + users.get(key));

        }
        //  przegl¹danie wartoœci, pozwala dostaæ siê wyl¹cznie tylko do wartoœci
        for (User user : users.values()) {
            System.out.println(user);
        }
        // iteracja po parach wartoœci (Entry) Entry to klasa wewn. wiêc zapis Map.Entry
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println(entry);
            entry.setValue(new User("Vanessa",33));
        }
        System.out.println(users);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}