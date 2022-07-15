package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public class Rectangle extends figura {
    Rectangle() {
        super();
    }

    @Override
    void showDim() {
        System.out.println("Wysokoœæ oraz d³ugoœæ wynosi: " + getHeight() + " " + getWidth());
    }

    Rectangle(int w, int h) {
        super(w, h, "prostok¹t");
    }

    Rectangle(int x) {
        super(x, "prostok¹t");
    }

    int area() {
        return getWidth() * getHeight();
    }
}
