package Day15Wielow¹tkowoœæ.Task3Synchr;

public class CounterTask implements Runnable {

    private Thread thread1;
    private Thread thread2;
    private int counter = 0;

    public CounterTask() {
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

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count();
            //counter++;
            //int newNumber = counter + 1;
            //counter = newNumber;

            //String text  = "abc";
            //int number = text.toUpperCase().toLowerCase().substring(1,2).charAt(0)+100;
        }
    }

    /*
    Counter: 0                  Counter 1               Counter: 2              Counter: 3           Couner: 2
    T1: jest 0                  T2: jest 1              T1: jest 2              T2: zmieniam na 2
    T1: ma byæ 1                T2: ma byæ 2            T1: ma byæ 3
    T1: zmieniam na 1           T1: jest 1              T1: zmieniam na 3
                                T1: ma byæ 2
                                T1: zmieniam na 2

     */

    private synchronized void count() {
        counter++;

    }

    public static void main(String[] args) {
        CounterTask counterTask = new CounterTask(); // przygotuj w¹tki i zadanie
        counterTask.startAll(); // sygna³ do rozpoczêcia pracy
        counterTask.joinAll(); // idŸ dalej jak w¹tki skoñcz¹ pracê
        System.out.println(counterTask.getCounter()); // wynik
    }
}
