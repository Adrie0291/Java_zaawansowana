package Day4DziedziczenieKonstruktory;

public class Wieloryb extends Zwierze {

    private int weight;

    public Wieloryb(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
// private - dost�p w danej klasie
// default - dost�p w ca�ym pakiecie
// protecdet - w pakiecie + w klasach dziedzicz�cych poza pakietem
// public - dowolny pakiet
