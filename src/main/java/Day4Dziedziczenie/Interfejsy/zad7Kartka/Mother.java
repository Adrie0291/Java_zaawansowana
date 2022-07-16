package Day4Dziedziczenie.Interfejsy.zad7Kartka;

public class Mother implements FamilyMember {
    private String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public void welcome() {
        System.out.println("I am mother. My name's: " + name);
    }

    @Override
    public boolean isAdult() {
        return true;
    }
}
