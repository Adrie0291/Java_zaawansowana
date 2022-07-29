package WzorceProjektowe.Dzien1.Task4.Zle;

public class Owner {
    public String name;
    public String surname;
    public String processor;
    public int ram;

    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Owner(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }
}
