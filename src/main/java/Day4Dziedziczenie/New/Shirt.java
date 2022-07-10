package Day4Dziedziczenie.New;

public class Shirt {
    private Size size;  // wczesniej byl String size teraz Size size, poslugujemy sie obiektami z klasy enum

    public Shirt(Size size) {   // tak samo, zmieniamy String size na Size size
        this.size = size;
    }

    public Size getSize() {     // tak samo, zaemianimy String na size
        return size;
    }

    public int getNumericSize() { // koszulka zwraca rozmiar jako enum ale moze
        return size.getNumericSize();// tez zwrocic numer w postaci liczbowej
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
