package Day4DziedziczenieKonstruktory;

public class Wieloryb extends Zwierze {

    private int weight;

    public Wieloryb(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
// private - dostêp w danej klasie
// default - dostêp w ca³ym pakiecie
// protecdet - w pakiecie + w klasach dziedzicz¹cych poza pakietem
// public - dowolny pakiet
