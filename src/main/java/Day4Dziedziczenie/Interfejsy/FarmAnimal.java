package Day4Dziedziczenie.Interfejsy;

public interface FarmAnimal {
    //int k; tak nie zapiszemy, nie zosta�a zainicjowana poniewa� w domy�le jest du�o s��w kluczowych
    // public static final int age = 10; -> ka�da zmienna zrobiona w tej klasie to sta�a statyczna publiczna
    int AGE = 10; // prawid�owy zapis.
        // Konstruktor nie dzia�a, a pola s� sta�ymi statycznymi
    // public abstract void eat();  domy�lnie ka�da metoda w interfejsach jest public i abstract
    void eat(); // wszystkie klasy w FarmAnimal sa publiczne i abstrakcyjne

    void makeSound();
}
