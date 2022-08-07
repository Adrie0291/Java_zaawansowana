package Day15.Task2;

public class Threads2Demo {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    System.out.println("Pozdrowienia z osobnego w¹tku");
                }
            }
        };
        Thread worker = new Thread(task);
        worker.start(); // start ,nie run
        for (int j = 0; j < 10; j++) {

            System.out.println("Pozdrowienia z MAIN");
        }
    }
}
