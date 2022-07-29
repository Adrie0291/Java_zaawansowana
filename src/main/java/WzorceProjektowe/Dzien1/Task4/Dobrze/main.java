package WzorceProjektowe.Dzien1.Task4.Dobrze;

public class main {
    public static void main(String[] args) {
        Owner owner = new Owner("Adrian", "Bloch");
        Computer computer = new Computer("Intel", 64);

        System.out.println("Hello I'm " + owner.getName() + " and I have " + computer.getProcesor() + " processor.");
    }
}
