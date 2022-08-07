package Day15.Zatrzymanie;

public class myTask implements Runnable { //    @Override
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Tik tak...");
            } catch (InterruptedException e) {
                System.out.println("Koñczê pracê!");
                break;
            }
        }
    }
}