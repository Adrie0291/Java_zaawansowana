package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public class Triangle extends figura {
    private String style;

    Triangle() {
        super();
        style = "nieokreslony";
    }

    Triangle(int w, int h, String s) {
        super(w, h, "trójk¹t");
        style = s;
    }

    Triangle(int x) {
        super(x, "trójk¹t");
        style = "wype³niony";
    }

    int area() {
        return getWidth() * getHeight() / 2;
    }
    @Override
    void showDim() {
        System.out.println("Wysokoœæ oraz d³ugoœæ wynosi: " + getHeight() + " " + getWidth());
    }
}