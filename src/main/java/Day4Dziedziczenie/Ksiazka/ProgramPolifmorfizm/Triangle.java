package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public class Triangle extends figura {
    private String style;

    Triangle() {
        super();
        style = "nieokreslony";
    }

    Triangle(int w, int h, String s) {
        super(w, h, "tr�jk�t");
        style = s;
    }

    Triangle(int x) {
        super(x, "tr�jk�t");
        style = "wype�niony";
    }

    int area() {
        return getWidth() * getHeight() / 2;
    }
    @Override
    void showDim() {
        System.out.println("Wysoko�� oraz d�ugo�� wynosi: " + getHeight() + " " + getWidth());
    }
}