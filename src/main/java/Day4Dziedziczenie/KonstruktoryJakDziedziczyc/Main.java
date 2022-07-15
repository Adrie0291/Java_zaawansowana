package Day4Dziedziczenie.KonstruktoryJakDziedziczyc;

import Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne.Cat;
import Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne.Dragon;
import Day4Dziedziczenie.KonstruktoryJakDziedziczyc.Grozne.Kangur;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dragon dragon = new Dragon("Charziard",200, "pomaraczowy");
        Kangur kangur = new Kangur("Kao", 7);

        System.out.println(cat);
        System.out.println(dragon);
        System.out.println(kangur);

    }
}
/*
1.Konstruktory nie dziedzicz¹ siê, s¹ zsynchronizowane
2. Konstruktory klas ni¿ej w dziedziczeniu (Cat) dopisuj¹ instrukcjê
"super()" wywo³uje domyœlny konstruktor klasy wy¿ej
3. Jeœli nie ma konstruktora domyœlnego kod sie podkreœla, trzeba dodaæ parametry.
4. Tworz¹c obiekt np. kota, musi powstaæ najpierw powstaæ obiekt Animala, ¿eby
powsta³ obiekt Animala, najpierw musi powstaæ obiekt Objectu (Object -> Animal -> Cat).


 */