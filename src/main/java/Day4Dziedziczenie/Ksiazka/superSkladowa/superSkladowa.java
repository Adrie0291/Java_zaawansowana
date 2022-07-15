package Day4Dziedziczenie.Ksiazka.superSkladowa;

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println(" i w klasie bazowej: " + super.i);
        System.out.println(" i w klasie pochodnej: " + i);
    }
}

class superSkladowa {
    public static void main(String[] args) {
        B test = new B(0, 234);
        test.show();
    }
}


