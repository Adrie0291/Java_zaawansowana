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
        worker.join(); // bêdzie sta³ i czeka³ a¿ w¹tek worker skoñczy pracowaæ
        System.out.println("W¹tek 1 koñczy");
        worker2.join();
        System.out.println("W¹tek 2 koñczy");

        //daje sobie gwrancjê ¿eby oba w¹tki skoñcza ju¿ pracowaæ

        for (int i = 0; i < 55; i++) {
            System.out.println("Wykorzystujemy wyniki pracy obu w¹tków, elementy A i B");
        }
    }
}
