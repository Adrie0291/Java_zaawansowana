package Day4Dziedziczenie.Interfejsy.zad7Kartka;

public class Daughter implements FamilyMember{
    private String name;

    public Daughter(String name) {
        this.name = name;
    }

    @Override
    public void welcome() {
        System.out.println("I am daughter. My name's: " + name);

    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
