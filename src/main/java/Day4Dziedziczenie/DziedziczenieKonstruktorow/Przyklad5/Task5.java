package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad5;
/*
Co sie wykona pierwsze ?
Idziemy do konstruktora B ktory uruchamia domyslny konstruktor do klasy A
Ale konstruktor klasy A wywoluje konstruktor klasy M ( bo po niej dziedziczy)>
Wiec najpierw wykona sie
1) Instrukcja SOUT  w klasie M z numerem z instrukcji super z klasy A
2) Nastepnie wykona sie instrukcja z klasy A z Strigniem intstrukcji super z klasy B
3) na konciu wykona sie instrukcja klasy B
 */
public class Task5 {
    public static void main(String[] args) {
        M konstruktor = new B();

    }
}
class M {
    public M(int number) {
        System.out.println("Konstruktor M " + number);
    }
}

class A extends M {
    public A(String text) {
        super(100);
        System.out.println("A konstruktor A" + text);
    }
}

class B extends A {
    public B() {
        super("Instrukcja w klasie B");
        System.out.println("B konstruktor B");
    }
}
