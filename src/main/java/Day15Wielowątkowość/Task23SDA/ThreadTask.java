package Day15Wielow¹tkowoœæ.Task23SDA;

public class ThreadTask {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    System.out.println(j + " Sun ");
                }
            }
        };
        Thread worker1 =new Thread(task1);
        Thread worker2 = new Thread(task2);
        worker1.start();
        worker2.start();
    }
}
