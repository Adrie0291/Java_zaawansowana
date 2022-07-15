package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public abstract class figura {

    private int length;
    private int height;
    private String name;

    figura() {
        height = length = 0;
        name = "none";
    }

    public figura(int length, int height, String name) {
        this.length = length;
        this.height = height;
        this.name = name;
    }

    figura(int wymiar, String nazwa) {
        length = height = wymiar;
        this.name = nazwa;
    }

    abstract void showDim();

    abstract int area();

    //    System.out.println("area() musi byæ przes³onniêta w klasach pochodnych");
    //    return 0;

    public int getWidth() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
