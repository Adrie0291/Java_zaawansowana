package Day15.Task3Synchr;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterAtomic implements Runnable {
    private Thread thread1;
    private Thread thread2;
    private AtomicInteger atomicCounter = new AtomicInteger(0);

    public CounterAtomic() {
        thread1 = new Thread(this);
        thread2 = new Thread(this);
    }

    public void startAll() {
        thread1.start();
        thread2.start();
    }

    public void joinAll() {
        try {
            thread1.join();

            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3450; i++) {
            atomicCounter.getAndIncrement();
        }
    }

    public int getCounter() {
        return atomicCounter.get();
    }

    public static void main(String[] args) {
        CounterAtomic counterAtomic = new CounterAtomic();
        counterAtomic.startAll();
        counterAtomic.joinAll();
        System.out.println(counterAtomic.getCounter());
    }
}