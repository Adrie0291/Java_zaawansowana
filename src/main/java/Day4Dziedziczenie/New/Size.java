package Day4Dziedziczenie.New;

public enum Size {
    XXL(46), XL(44), L(42), M(40), S(38), XS(36), XXS(34);

    private int numericSize;

    public int getNumericSize() {
        return numericSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "numericSize=" + numericSize +
                '}';
    }


    public void setNumericSize(int numericSize) { // wartosci w enumie sa wywolaniami tego konstruktora
        this.numericSize = numericSize;
    }

    Size(int numericSize) {    // konstruktor klasy enumowej jest domyslnie prywatny
        this.numericSize = numericSize;     //w sumie ok bo nie chcemy miec gdzies dokladane skad inad nowe wartosci
    }
}
