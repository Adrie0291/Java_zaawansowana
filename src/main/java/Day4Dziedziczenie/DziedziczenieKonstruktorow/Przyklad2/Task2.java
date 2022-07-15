package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad2;
/* 2 . Przyk³ad
SOUT: Konstruktor A
SOUT: Konstruktor B
Dlaczego tak siê dzieje ? Domyœlnie w klasie B dopisuje siê (niezauwa¿alnie) instrukcja super(); która odwo³uje do klasy nadrzêdnej czyli do klasy A.
 */
public class Task2 {
    public static void main(String[] args) {
        A konstruktor = new B();
    }
}

class A {
    public A() {
        System.out.println("Konstruktor A");
    }
}

class B extends A{
    public B() {
        //super();
        System.out.println("Konstruktor B");
    }
}
