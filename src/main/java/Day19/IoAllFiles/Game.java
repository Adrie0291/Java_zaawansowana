package Day19.IoAllFiles;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class Game implements Serializable {

    private String title;
    private List<GameDeveloper> gameDevelopers;
    public static final long serialVersionUID = -7177210297532229888L; // ręczne przejęcie kontroli nad numerem serjnym klasy
    private transient Scanner scanner = new Scanner(System.in); // transient przy serializacji oznacza pominięcie

    public void showTitle(){
        System.out.println(title);
    }
    public void showTitle2(){
        System.out.println(title);
    }

    public Game(String title, List<GameDeveloper> gameDevelopers) {
        this.title = title;
        this.gameDevelopers = gameDevelopers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", gameDevelopers=" + gameDevelopers +
                '}' + "\n";


    }
}
