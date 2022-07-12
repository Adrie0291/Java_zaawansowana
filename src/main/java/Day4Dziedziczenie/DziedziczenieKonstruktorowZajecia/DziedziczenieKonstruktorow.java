package Day4Dziedziczenie.DziedziczenieKonstruktorowZajecia;

/*
Konstruktorów nie dziedziczymy. Co sie z nimi dzieje ?
Konstruktory siê wzajemnie wywo³uj¹ od najmniejszego do najwiêkszego w hierarchii dziedziczenia
Przyk³ad koncepcyjny
*/
public class DziedziczenieKonstruktorow {
    public static void main(String[] args) {
  //      A konstruktor = new B();

    }
}

/* III przyk³ad
Stworzyliœmy w³asny konstruktor, wiec domyœlny siê nie utworzy, dlatego jest b³¹d.
Musimy w klasie B utworzyæ jawnie instrukcjê super i podaæ jej parametr, który oczekuje konstruktor w klasie A
wtedy wykona siê wpierw Constructor A wraz z instrukcj¹ w instrukcji super z klasy B
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
/* II przyk³ad
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

