package Day15.CzekanieNaWatek;

public class Watki {

    public static void main(String[] args) throws InterruptedException  {
        Runnable result = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {

                    System.out.println("Elementy A: ");
                }
            }
        };
        Runnable result2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {

                    System.out.println("Elementy B: ");
                }
            }
        };
        Thread worker = new Thread(result);
        Thread worker2 = new Thread(result2);

        worker.start(); // start ,nie run
        worker2.start();
        worker.join(); // b�dzie sta� i czeka� a� w�tek worker sko�czy pracowa�
        System.out.println("W�tek 1 ko�czy");
        worker2.join();
        System.out.println("W�tek 2 ko�czy");

        //daje sobie gwrancj� �eby oba w�tki sko�cza ju� pracowa�

        for (int i = 0; i < 55; i++) {
            System.out.println("Wykorzystujemy wyniki pracy obu w�tk�w, elementy A i B");
        }
    }
}
