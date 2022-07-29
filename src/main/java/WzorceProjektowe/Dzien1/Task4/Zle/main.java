package WzorceProjektowe.Dzien1.Task4.Zle;
/* Program zawiera szereg błędów
Zasada S została złamana z SOLID, klasa powinna mieć jedna odpowiedzialność
Musza powstać 2 klasy Owner i Computer
Brak zmiennych prywatnych (Hermetyzacja)
Czego nie potrzebujemy, to tego nie generujemy
 */
public class main {
    public static void main(String[] args) {
        Owner mike = new Owner("Mike", "Saiko");
        Owner computer = new Owner("Intel", 60);
        System.out.println("Hello I am " + mike.name);
        System.out.println("and I have " + computer.processor + " processor");
    }
}
