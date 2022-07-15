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
1.Konstruktory nie dziedzicz� si�, s� zsynchronizowane
2. Konstruktory klas ni�ej w dziedziczeniu (Cat) dopisuj� instrukcj�
"super()" wywo�uje domy�lny konstruktor klasy wy�ej
3. Je�li nie ma konstruktora domy�lnego kod sie podkre�la, trzeba doda� parametry.
4. Tworz�c obiekt np. kota, musi powsta� najpierw powsta� obiekt Animala, �eby
powsta� obiekt Animala, najpierw musi powsta� obiekt Objectu (Object -> Animal -> Cat).


 */