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
        System.out.println("Jestem s�oniem. Rycz� tr�b�");
    }

    public void zrywanieDrzew() {
        System.out.println("Jestem s�oniem, potrafi� zrywa� drzewa");
    }
    public void sleep() {
        System.out.println("Jestem s�oniem. �pi� 14h ");}
}
