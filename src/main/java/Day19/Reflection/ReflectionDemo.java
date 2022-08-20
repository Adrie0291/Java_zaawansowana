package Day19.Reflection;

import java.lang.reflect.*;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Person person = new Person("Marcin", 20);

        // Korzystanie z refleksji zaczyna się od zdobycia obiektu Class
        // 1. sposób
        Class class1 = Person.class;

        //2. z wtkorzystaniem obiektu
        Class class2 = person.getClass();

        //3. sposób pełna nazwa klasy (obsługa wyjątku)
        Class class3 = Class.forName("Day19.Reflection.Person");

        System.out.println("Klasa 1");
        System.out.println(class1);
        System.out.println("Klasa 2");
        System.out.println(class2);
        System.out.println("Klasa 3");
        System.out.println(class3);

        // sprawdzanie ile jest getterów w metodach
        Method[] methods = class1.getMethods();
        int getterCount = 0;
        for (Method method : methods) {
            if (method.getName().contains("get")) {
                getterCount++;
            }
        }
        System.out.println("Ilość getterów: " + getterCount);

        // sprawdzenie modyfikatorów
        int modifierCode = class1.getModifiers();
        System.out.println(Modifier.isPublic(modifierCode));
        System.out.println(Modifier.toString(modifierCode));
        // wyciąganie metody z klasy
        System.out.println("Wyciąganie metody: ");
        Method method1 = class1.getMethod("sayHello");
        System.out.println(method1);
        System.out.println(method1.getReturnType());
        // wyciąganie metody
        method1.invoke(person);

        // wyciąganie 2 metody:
        Method method2 = class2.getMethod("sayHelloWithTitle", String.class);
        System.out.println(method2);
        method2.invoke(person, "Pan");


        // Dostanie się do konstruktora z parametrami
        Constructor constructor = class1.getConstructor(String.class, int.class);
        // Person person = new Person("Ada",30);
        Person person2 = (Person) constructor.newInstance("Ada", 30);
        System.out.println(person2);
        System.out.println("Pole");
        // dostanie się do pola "name" / odczytanie tego obiektu
        // Field field = class1.getField("name"); // nie dla prywatynch
        Field field = class1.getDeclaredField("name"); // na wszystkie nawet niewidoczne z tego miejsca
        field.setAccessible(true); // pozwala odczytać nawet prywatne pola
        System.out.println(field.getName());
        System.out.println(field.get(person2));

        // zmiana imienia:
        field.set(person2,"Adrianna");
        System.out.println(person2);
    }
}
