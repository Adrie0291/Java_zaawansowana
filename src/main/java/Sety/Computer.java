package Sety;

public class Computer {
    private String procesor;
    private int ram;

    public Computer(String procesor, int ram) {
        this.procesor = procesor;
        this.ram = ram;
    }

    public String getProcesor() {
        return procesor;
    }
}