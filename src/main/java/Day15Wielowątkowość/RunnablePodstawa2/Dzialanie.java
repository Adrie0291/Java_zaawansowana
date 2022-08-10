package Day15Wielow¹tkowoœæ.RunnablePodstawa2;

public class Dzialanie implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + "wewn¹trz" + Thread.currentThread().getId());

        }
    }
}
