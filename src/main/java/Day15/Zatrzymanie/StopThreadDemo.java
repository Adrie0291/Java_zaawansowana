package Day15.Zatrzymanie;

public class StopThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        myTask myTask = new myTask();
        Thread thread = new Thread(myTask);
        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
    }
}