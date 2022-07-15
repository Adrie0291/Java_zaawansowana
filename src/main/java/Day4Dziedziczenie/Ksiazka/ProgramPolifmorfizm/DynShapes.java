package Day4Dziedziczenie.Ksiazka.ProgramPolifmorfizm;

public class DynShapes {
    public static void main(String[] args) {
        figura figury[] = new figura[6];

        figury[0] = new Triangle();
        figury[1] = new Triangle(8, 12, "pusty");

        figury[2] = new Triangle(7);

        figury[3] = new Rectangle();
        figury[4] = new Rectangle(10, 4);
        figury[5] = new Rectangle(9);



        for (int i = 0; i < figury.length; i++) {
            System.out.println("Typ obiektu: " + figury[i].getName());
            System.out.println("Powierzchnia wynosi: " + figury[i].area());
            figury[i].showDim();
            System.out.println();
        }
    }
}
