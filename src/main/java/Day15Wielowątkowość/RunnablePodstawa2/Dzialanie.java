package Day15Wielowątkowość.RunnablePodstawa2;

public class Dzialanie implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + "wewnątrz" + Thread.currentThread().getId());

        }
    }
}
