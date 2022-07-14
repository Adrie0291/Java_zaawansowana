package Day4Dziedziczenie.CitizenZadanieDodatkowe;

/* Wszystko mozemy zrobic w klasie nieabstrakcyjnej. Ale klasa abstr. ulatwia projektowanei hierarchii dziedziczenia
Chcemy stworzyc og�ln� klas�, z kt�rej nie zamierzamy robi� obiekt�w (obiekty nie s� wskazane).
Nie stworzymy obiektu tutaj np. "new Citizen" -> obiekt duch. (powoduje to problemy)
Mo�emy umieszcza� metody abstrakcyjne, kt�re trzeba nadpisywa� (wi�c nie zapomni si� o tym).
Klasa tylko po to, aby po niej dziedziczy�, wsp�lne cechy, wsp�lne obiekty, ale wymaga to doprecyzowania
 */
public abstract class Citizen {
    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote(); // metoda abstrakcyjna nie ma cia�a, musimy j� nadpisywa�

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}

