package Day4Dziedziczenie.DziedziczenieKonstruktorow.Przyklad1;
// 1. Prosty przyk³ad. SOUT: A
public class Task1 {
    public static void main(String[] args) {
        A konstruktor = new A();
    }
}

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
