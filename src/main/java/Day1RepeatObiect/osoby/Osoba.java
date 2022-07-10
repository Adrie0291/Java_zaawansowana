package Day1RepeatObiect.osoby;

import java.util.Random;

public class Osoba { // pola moga byc statyczne lub obiektowe, tu mamy obiektowe

   private String imie;
    private int wiek;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
//  public Osoba(String startoweImie, int startowyWiek){
       // imie = startoweImie;
      //  wiek = startowyWiek;
//}

    public Osoba(String imie, int wiek) { // zmienne lokalne przyslaniaja pole tam u gory
        //this odnosi sie do obiektu. this. pola i metody mamy do wyboru
        this.imie = imie;
        this.wiek = wiek; // te same nazwy parametrow i pol , dlatego this.
    }

    public Osoba(){
        imie = "Jan";
        Random random = new Random();
        wiek = random.nextInt(100) + 1;
    }

    void przywitajSie() {
        System.out.println("Jestem " + imie + " mam " + wiek + "lat");
    }

    void wyprawUrodziny() {
        wiek++;
    }

}

