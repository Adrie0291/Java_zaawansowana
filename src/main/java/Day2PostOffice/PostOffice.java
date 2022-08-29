package Day2PostOffice;

import java.util.ArrayList;
import java.util.Scanner;

public class PostOffice {

    private double earning = 0.0;
    ArrayList<Paczka> wszystkiePaczki = new ArrayList<>();

    public void sendPackage(double money, Paczka paczka) {
        System.out.println("Kosz wys³ania paczki wynosi: " + paczka.costPackage());
        if (money >= paczka.costPackage()) {
            System.out.println("Twoja reszta wynosi " + (money - paczka.costPackage()));
            earning+= paczka.costPackage();
           wszystkiePaczki.add(paczka);
          //  System.out.println("Poczta zarobi³¹: " + earning + "z³otych");
        } else {
            System.out.println("Za ma³o kasy");
        }


    }

    public Paczka lastPackage(){
        return wszystkiePaczki.get(0);
    }

    public Paczka creatPackage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adresata");
        String sender = scanner.next();
        System.out.println("Podaj nadawce");
        String receiver = scanner.next();
        System.out.println("Podaj wagê");
        double weight = scanner.nextDouble();
        System.out.println("Czy paczka jest priorytetowa ? false / true");
        boolean priorioty = scanner.hasNext();
        return new Paczka(sender, receiver,weight,priorioty);
    }

    public double getEarning() {
        return earning;
    }

}

