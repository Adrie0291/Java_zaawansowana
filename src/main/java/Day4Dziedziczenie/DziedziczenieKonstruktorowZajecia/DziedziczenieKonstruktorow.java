package Day4Dziedziczenie.DziedziczenieKonstruktorowZajecia;

/*
Konstruktor�w nie dziedziczymy. Co sie z nimi dzieje ?
Konstruktory si� wzajemnie wywo�uj� od najmniejszego do najwi�kszego w hierarchii dziedziczenia
Przyk�ad koncepcyjny
*/
public class DziedziczenieKonstruktorow {
    public static void main(String[] args) {
  //      A konstruktor = new B();

    }
}

/* III przyk�ad
Stworzyli�my w�asny konstruktor, wiec domy�lny si� nie utworzy, dlatego jest b��d.
Musimy w klasie B utworzy� jawnie instrukcj� super i poda� jej parametr, kt�ry oczekuje konstruktor w klasie A
wtedy wykona si� wpierw Constructor A wraz z instrukcj� w instrukcji super z klasy B
A konstruktor = new B();
class A {
    public A(String text) {
        System.out.println("Constructor A" + text);
    }
}

class B extends A {
    public B() {
        super(" tekst z instrukcji super");
        System.out.println(" Constructor B");
    }
}



 */
/* II przyk�ad
 A konstruktor = new B();   SOUT: A, B (po enterze)
class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

 A konstruktor = new B();
 */

