package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public class Rectangle extends figura {
    Rectangle() {
        super();
    }

    @Override
    void showDim() {
        System.out.println("Wysoko�� oraz d�ugo�� wynosi: " + getHeight() + " " + getWidth());
    }

    Rectangle(int w, int h) {
        super(w, h, "prostok�t");
    }

    Rectangle(int x) {
        super(x, "prostok�t");
    }

    int area() {
        return getWidth() * getHeight();
    }
}
