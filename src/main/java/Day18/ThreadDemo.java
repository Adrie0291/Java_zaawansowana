package Day18;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("hello"));
        thread.start();
    }
}
        /* 1. wersja
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        Thread thread = new Thread(task);
        thread.start();

         */

/* 2. wersja
   Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        thread.start();
 */