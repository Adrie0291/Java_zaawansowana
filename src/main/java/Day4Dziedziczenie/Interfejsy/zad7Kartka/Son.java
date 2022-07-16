package Day4Dziedziczenie.Interfejsy.zad7Kartka;

public class Son implements FamilyMember {
    private String name;

    public Son(String name) {
        this.name = name;
    }

    @Override
    public void welcome() {
        System.out.println("Who's asking? My name's: " + name);
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
