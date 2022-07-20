package Day8Repeat.hotel;

import java.util.Random;

// Model danych
public class Room {
    private int nr;
    private int capacity;
    private boolean occupied;
    private boolean withBathroom;

    private static int nextNr = 1;
    // pole MUSI by� statyczne, je�li zmienimy nr 2 pokoju , to kolejne wywolanie konstr
    // bedzie widziec juz 2 bo jest tylko jedno takie pole dla wszystkich obiektow
    // wszystkie pokoje widz� jedn� zmienn� nextNr

    public Room() {
        nr = nextNr;
        nextNr++;
        Random random = new Random();
        capacity = random.nextInt(6) + 1; // od 1 do 6
        occupied = random.nextBoolean();
        withBathroom = random.nextBoolean();
    }

    @Override
    public String toString() {
        return "Room{" +
                "nr=" + nr +
                ", capacity=" + capacity +
                ", occupied=" + occupied +
                ", withBathroom=" + withBathroom +
                '}';
    }
}
