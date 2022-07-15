package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad4;
/* Przyklad 4 Dodajemy klase M.A dziedziczy po klasie M. B dziedziczy po klasie A ( i M).
Czemu publicA() sie podkresla ? Brakuje domyslnego konstruktora w klasie M.
Musimy dopisac w klasie A instrukcje super(int) ;


 */
public class Task4 {
    public static void main(String[] args) {
        A konstruktor = new B();
    }
}

class M {
    public M(int number) {
        System.out.println("Konstruktor MM " + number);
    }
}

class A extends M {
    public A() {
        super(39);                                  // tutaj trzeba bylo dopisac  !
        System.out.println("Konstrutkor A");
    }
}

class B extends A {
    public B() {
        System.out.println("Konstruktor B");
    }
}
