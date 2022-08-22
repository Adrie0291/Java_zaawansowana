package Day19.Reflection;

public final class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Cześć, jestem " + name);

    }

    public void sayHelloWithTitle(String title) {
        System.out.println("Dzień Dobry, jestem " + title + " " + name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
