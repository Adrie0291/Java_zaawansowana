package Day4Dziedziczenie.cwiczeDziedzicz;

public class Elephant extends Animal {
    private String name;
    private int age;
    private int weight;


    public Elephant(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void sound() {
        System.out.println("Jestem s³oniem. Ryczê tr¹b¹");
    }

    public void zrywanieDrzew() {
        System.out.println("Jestem s³oniem, potrafiê zrywaæ drzewa");
    }
    public void sleep() {
        System.out.println("Jestem s³oniem. Œpiê 14h ");}
}
