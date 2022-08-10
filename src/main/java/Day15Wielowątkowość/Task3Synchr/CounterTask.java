package Day15Wielow�tkowo��.Task3Synchr;

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
    T1: ma by� 1                T2: ma by� 2            T1: ma by� 3
    T1: zmieniam na 1           T1: jest 1              T1: zmieniam na 3
                                T1: ma by� 2
                                T1: zmieniam na 2

     */

    private synchronized void count() {
        counter++;

    }

    public static void main(String[] args) {
        CounterTask counterTask = new CounterTask(); // przygotuj w�tki i zadanie
        counterTask.startAll(); // sygna� do rozpocz�cia pracy
        counterTask.joinAll(); // id� dalej jak w�tki sko�cz� prac�
        System.out.println(counterTask.getCounter()); // wynik
    }
}
