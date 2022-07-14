package Day4Dziedziczenie.CitizenZadanieDodatkowe;

/* Wszystko mozemy zrobic w klasie nieabstrakcyjnej. Ale klasa abstr. ulatwia projektowanei hierarchii dziedziczenia
Chcemy stworzyc ogóln¹ klasê, z której nie zamierzamy robiæ obiektów (obiekty nie s¹ wskazane).
Nie stworzymy obiektu tutaj np. "new Citizen" -> obiekt duch. (powoduje to problemy)
Mo¿emy umieszczaæ metody abstrakcyjne, które trzeba nadpisywaæ (wiêc nie zapomni siê o tym).
Klasa tylko po to, aby po niej dziedziczyæ, wspólne cechy, wspólne obiekty, ale wymaga to doprecyzowania
 */
public abstract class Citizen {
    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote(); // metoda abstrakcyjna nie ma cia³a, musimy j¹ nadpisywaæ

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}

