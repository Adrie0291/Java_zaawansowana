package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad2;
/* 2 . Przyk�ad
SOUT: Konstruktor A
SOUT: Konstruktor B
Dlaczego tak si� dzieje ? Domy�lnie w klasie B dopisuje si� (niezauwa�alnie) instrukcja super(); kt�ra odwo�uje do klasy nadrz�dnej czyli do klasy A.
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
