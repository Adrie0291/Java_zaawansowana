package Day1RepeatObiect.PracaNaObiektach.KompozycjaUzupelnianiePola1;

public class Firma {
    Osoba prezes = new Osoba("Elon");

    void zapytajOUrlop(){
        System.out.println(prezes.name + " Ci� zwalnia i zast�puje robotami");
    }
}
