package Day1RepeatObiect.PracaNaObiektach.PrzekazanieObiektuKonstruktor3;

public class Osoba {
    String name;

    public Osoba(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                '}';
    }
}
