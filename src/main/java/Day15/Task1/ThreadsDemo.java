package Day15.Task1;

public class ThreadsDemo {
    public static void main(String[] args) {
        Runnable task = new Runnable(){
            @Override
            public void run(){
                System.out.println("Pozdrowienia z osobnego w¹tku");
            }
        };
        Thread worker = new Thread(task);
        worker.start();
    }

}
