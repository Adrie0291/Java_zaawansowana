package Day15Wielowątkowość.Task23SDA;

public class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Earth");
        }
    }
}