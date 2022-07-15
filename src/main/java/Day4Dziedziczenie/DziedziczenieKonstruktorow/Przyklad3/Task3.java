package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad3;
/* 3 przyk³ad. Na pocz¹tku podkreœla nam siê na czerwono public B(){
Czemu ?
Klasa B próbuje uruchomiæ konstruktor domyœlny z klasy B, jednak nie ma takiego konstruktora, poniewa¿ zosta³ napisany z parametrem w klasie A.
Jeœli zosta³ napisany, to konstruktor domyœlny siê sam nie tworzy. Jesteœmy zmuszeni korzystaæ z konstruktora z klasy A i musimy korzystaæ jawnie.
Czyli dopisac instrukcje super z parametrem.
 */
public class Task3 {
    public static void main(String[] args) {
        A konstruktor = new B();
    }
}

class A {
    public A(String text) {
        System.out.println("Konstruktor A " + text);
    }
}

class B extends A {
    public B() {
        super(" instrukcja w klasie B");      // trzeba tutaj bylo dopisac instrukcje
        System.out.println("B konstruktor");
    }
}