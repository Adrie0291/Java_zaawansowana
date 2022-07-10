package Day2WorkHome;

import java.util.Arrays;
// W programie Tworzymy obiekt okno oraz ³ó¿ko z odpowiednimi konstruktorami.
// W klasie Room mamy  2 metody stworzenia pokoju ktory sklada sie z okien i lozka. (Generowanie oraz konstruktor bezparametrowy)
// Ciekawostka jest metoda tidy ktora jesy wywolywana z klasy House nastepnie do klasy Room, ktora idzie nastepnie do klasy
// bed oraz window w celu wyzerowania licznika i otworzenia okien
// Na koniec tworzymy klase House ktora zawiera w sobie pokoje hotelowe (rozne) i na niej wywolujemy metode sprzatania.


public class HouseDemo {
    public static void main(String[] args) {
        // windows

        Window window = new Window();
        window.doOpen();


        System.out.println(window);

        Window[] windows = new Window[4];
        windows[0] = new Window();
        windows[1] = new Window();
        windows[2] = new Window();
        windows[3] = new Window();


        for (Window aWindow : windows) {
            aWindow.doOpen();
        }
        System.out.println(Arrays.toString(windows));
        // bed
        Bed bed = new Bed(4);
        bed.clean();
        System.out.println(bed);

        // room
        Room room = new Room();
        Room room2 = new Room(bed, windows);

        System.out.println(room);
        System.out.println(room2);

        //dom
        Room[] rooms = {room, room2};
        House house = new House(rooms);
        house.tidy();
        System.out.println(house);
    }
}
