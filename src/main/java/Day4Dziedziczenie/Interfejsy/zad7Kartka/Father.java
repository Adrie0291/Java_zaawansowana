package Day4Dziedziczenie.Interfejsy.zad7Kartka;

public class Father implements FamilyMember {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public void welcome() {
        System.out.println("I am your father. My name's: " + name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
