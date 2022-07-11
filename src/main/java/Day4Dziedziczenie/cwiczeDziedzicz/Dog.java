package Day4Dziedziczenie.cwiczeDziedzicz;

public class Dog extends Animal{
    private String name;
    private int age;
    private int lenghtBody;

    public Dog(String name, int age, int lenghtBody) {
        this.name = name;
        this.age = age;
        this.lenghtBody = lenghtBody;
    }
    public Dog(){
        name = "Feliks";
        age = 33;
        lenghtBody = 4921;
    }


    public void sound(){
        System.out.println("Jestem psem. Szczekam");
    }
    public void robHalas(){
        sound();
    }

    public void kopanie(){
        System.out.println("Jestem psem. Kopiê dziury");
    }
    public void sleep(){
        System.out.println("Jestem psem, œpiê 6h");
    }
}
