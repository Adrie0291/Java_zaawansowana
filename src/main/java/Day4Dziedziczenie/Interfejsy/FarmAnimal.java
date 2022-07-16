package Day4Dziedziczenie.Interfejsy;

public interface FarmAnimal {
    //int k; tak nie zapiszemy, nie zosta³a zainicjowana poniewa¿ w domyœle jest du¿o s³ów kluczowych
    // public static final int age = 10; -> ka¿da zmienna zrobiona w tej klasie to sta³a statyczna publiczna
    int AGE = 10; // prawid³owy zapis.
        // Konstruktor nie dzia³a, a pola s¹ sta³ymi statycznymi
    // public abstract void eat();  domyœlnie ka¿da metoda w interfejsach jest public i abstract
    void eat(); // wszystkie klasy w FarmAnimal sa publiczne i abstrakcyjne

    void makeSound();
}
