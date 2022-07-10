package Day1RepeatObiect.PracaNaObiektach.KonstruktorWypelniaPole2;

import java.util.Random;

public class Firma {
    Osoba roboPrezes;

    Firma() {
        Random random = new Random();
        int nr = random.nextInt(10);
        roboPrezes = new Osoba("Glados" + nr);

    }

    @Override
    public String toString() {
        return "Firma{" +
                "roboPrezes=" + roboPrezes +
                '}';
    }
}



