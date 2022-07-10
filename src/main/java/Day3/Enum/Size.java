package Day3.Enum;

public enum Size {
    XXL(46), XL(44), L(42), M(40), S(38), XS(36), XXS(34);

    private int numericSize;

    Size(int numericSize) {
        this.numericSize = numericSize;
    }

    public int getNumericSize() {
        return numericSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "numericSize=" + numericSize +
                '}';
    }
}
/*
Enumy � zbi�r obiekt�w z danej klasy. Kt�rych
->  nie mo�na robi� z zewn�trz przez new,
-> s� zdefiniowane w klasie obiektu i od razu s� wstawione  do zmiennej kt�re s� statyczne, publiczne oraz final
Wa�ne ! To nie s� Stringi, to s� obiekty typu Size !
Wa�ne, poniewa� w klasie Shirt, w kt�rej okre�lali�my wcze�niej rozmiar za pomoc� klasy String.
Zmieniamy na typ Size.
Pos�ugujemy si� obiektami z klasy enumowej.

 */
