package Day4Dziedziczenie.Ksiazka;

public class Rectangle extends twoD {
    private String color;
    public Rectangle(String color,double width, double height) {
        super(width, height);
        this.color = color;
    }

    boolean isSquare() {
        return (getWidth() == getHeight());

    }

    double area() {
        return getWidth() * getHeight();

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                '}';
    }
}

