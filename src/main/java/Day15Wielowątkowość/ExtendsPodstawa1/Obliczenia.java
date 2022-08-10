package Day15Wielow¹tkowoœæ.ExtendsPodstawa1;

public class Obliczenia extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 7; i++) {
            System.out.println(i + ".ID: " + Thread.currentThread().getId());
        }
    }
}
