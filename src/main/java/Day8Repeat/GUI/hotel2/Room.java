package Day8Repeat.GUI.hotel2;

import java.util.Random;

// Model danych
public class Room {
    private int nr;
    private int capacity;
    private boolean occupied;
    private boolean withBathroom;

    private static int nextNr = 1;
    // pole MUSI byæ statyczne, jeœli zmienimy nr 2 pokoju , to kolejne wywolanie konstr
    // bedzie widziec juz 2 bo jest tylko jedno takie pole dla wszystkich obiektow
    // wszystkie pokoje widzê jedn¹ zmienn¹ nextNr

    public Room() {
        nr = nextNr;
        nextNr++;
        Random random = new Random();
        capacity = random.nextInt(6) + 1; // od 1 do 6
        occupied = random.nextBoolean();
        withBathroom = random.nextBoolean();
    }

    public void book(){
        occupied = true;
    }
    public int getNr() {
        return nr;
    }

    public static int getNextNr() {
        return nextNr;
    }
    public static void setNextNr(int nextNr) {
        Room.nextNr = nextNr;
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

    public boolean isOccupied() {
        return occupied;
    }
}
