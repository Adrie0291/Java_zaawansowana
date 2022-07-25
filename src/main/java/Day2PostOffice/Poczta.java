package Day2PostOffice;

import java.util.ArrayList;
import java.util.Scanner;

public class Poczta {
    Paczka paczuszka = new Paczka();

    ArrayList<Letter> lisciki = new ArrayList<>();
    ArrayList<Paczka> wszystkiePaczki = new ArrayList<>();
    private int earning = 0;

    public void showAllPack() {
        if (wszystkiePaczki.isEmpty()) {
            System.out.println("Nie ma paczek do wyświetlenia");
        } else {
            for (Paczka jednaPaczka : wszystkiePaczki) {
                System.out.println(jednaPaczka);

            }
        }

    }

    public double sendPacakge() {
        Paczka packi = stworzPaczke();
        System.out.println("Koszt wysłania paczki wynosi: " + packi.totalPrice());
        System.out.println("Podaj kwotę, którą chcesz zapłacić");
        Scanner scanner = new Scanner(System.in);
        int myMoney = scanner.nextInt();
        if (myMoney >= packi.totalPrice()) {
            System.out.println("Twoja reszta wynosi " + (myMoney - packi.totalPrice()));
            earning += packi.totalPrice();
            wszystkiePaczki.add(packi);
        } else {
            System.out.println("Za mało kasy");
        }
        return earning;
    }

    public Paczka stworzPaczke() {

        Poczta poczta = new Poczta();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie nadawcy");
        String name = scanner.nextLine();
        System.out.println("Podaj imie adresata");
        String adresat = scanner.nextLine();
        System.out.println("Podaj wagę paczki");
        double weight = scanner.nextDouble();
        System.out.println("Czy paczka jest priorytetowa ? false / true");
        boolean priorioty = scanner.hasNext();
        return new Paczka(name, adresat, weight, priorioty);
    }

    public double sendLetter() {
        if (lisciki.size() < 2) {
            Letter letter1 = stworzList();
            System.out.println("Koszt wysłania listu wynosi" + letter1.price());
            System.out.println("Podaj kwote jaka chcesz zaplacic");
            Scanner scanner = new Scanner(System.in);
            int myMoney = scanner.nextInt();
            if (myMoney >= letter1.price()) {
                System.out.println("Twoja reszta wynosi " + (myMoney - letter1.price()));
                earning += letter1.price();
                lisciki.add(letter1);
            } else {
                System.out.println("Za mało kasy");

            }

        } else
            System.out.println("Moge wyslac tylko 10 listów");

        return 1;
    }

    public Letter stworzList() {
        Poczta poczta = new Poczta();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ulice nadawcy");
        String street = scanner.nextLine();
        System.out.println("Podaj nr mieszkania");
        int nr = scanner.nextInt();
        System.out.println("Podaj kod pocztowy");
        String blad = scanner.nextLine();
        String kodPocztowy = scanner.nextLine();
        System.out.println("Podaj ulice odbiorcy");
        String street2 = scanner.nextLine();
        System.out.println("Podaj nr mieszkania");
        int nr2 = scanner.nextInt();
        System.out.println("Podaj kod pocztowy");
        String kodPocztowy2 = scanner.nextLine();
        Adres adres1 = new Adres(street, nr, kodPocztowy);
        Adres adres2 = new Adres(street2, nr2, kodPocztowy2);
        System.out.println("Czy przesylka ma byc priorytetowa ? false / true");
        boolean priority = scanner.hasNext();
        Letter letter = new Letter(adres1, adres2, priority);
        return letter;


    }
}