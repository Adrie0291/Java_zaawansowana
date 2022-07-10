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
Enumy – zbiór obiektów z danej klasy. Których
->  nie mo¿na robiæ z zewn¹trz przez new,
-> s¹ zdefiniowane w klasie obiektu i od razu s¹ wstawione  do zmiennej które s¹ statyczne, publiczne oraz final
Wa¿ne ! To nie s¹ Stringi, to s¹ obiekty typu Size !
Wa¿ne, poniewa¿ w klasie Shirt, w której okreœlaliœmy wczeœniej rozmiar za pomoc¹ klasy String.
Zmieniamy na typ Size.
Pos³ugujemy siê obiektami z klasy enumowej.

 */
