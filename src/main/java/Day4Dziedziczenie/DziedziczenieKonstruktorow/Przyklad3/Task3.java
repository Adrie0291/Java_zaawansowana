package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad3;
/* 3 przyk�ad. Na pocz�tku podkre�la nam si� na czerwono public B(){
Czemu ?
Klasa B pr�buje uruchomi� konstruktor domy�lny z klasy B, jednak nie ma takiego konstruktora, poniewa� zosta� napisany z parametrem w klasie A.
Je�li zosta� napisany, to konstruktor domy�lny si� sam nie tworzy. Jeste�my zmuszeni korzysta� z konstruktora z klasy A i musimy korzysta� jawnie.
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