package Day4Dziedziczenie.Ksiazka;

public class Triangle extends twoD {
    private String style;

    public Triangle(String style, double width, double height) {
        super(width, height);
        this.style = style;
    }

    double area() {
        return getWidth() * getHeight() / 2;

    }

    void showStyle() {
        System.out.println("Trójk¹t jest: " + style);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "style='" + style + '\'' +
                '}';
    }
}
