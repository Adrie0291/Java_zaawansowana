package Day4Dziedziczenie.Ksiazka;

public class twoD {
    private double width;
    private double height;

    public twoD(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Szerokosc i wysokosc obiektu: " + width + " i " + height);

    }

    @Override
    public String toString() {
        return "twoD{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
