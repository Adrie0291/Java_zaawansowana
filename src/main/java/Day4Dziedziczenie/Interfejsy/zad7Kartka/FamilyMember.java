package Day4Dziedziczenie.Interfejsy.zad7Kartka;

public interface FamilyMember {

    default void introduce() {
        System.out.println("I am just a simple family member");
    }

    void welcome();

    boolean isAdult();
}
