package Sety;

public class zadanie4 {

    public static void main(String[] args) {
        Owner owner = new Owner("Seba", "Glowacki");
        Computer computer = new Computer("Intel", 8);


        System.out.println("Hello i'm " + owner.getName() + "" +
                "and i have " + computer.getProcesor() + "processor");
    }
}
