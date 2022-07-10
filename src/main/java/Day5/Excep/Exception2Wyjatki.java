package Day5.Excep;

public class Exception2Wyjatki {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = "ziemia";

        try {
            String result = text.toUpperCase();
            System.out.println(result);
            System.out.println("To siê wyœwietli jeszcze w bloku try");
            System.out.println(text.charAt(100));
            System.out.println(10 / 0);                                             // w tym momencie to w ogole sie nie zostanie wykonane przez blad w linijce 12
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {        // po³¹czony catch z linijki 19
            System.out.println("Wyst¹pi³ nullpointer lub BoundsException");
        } catch (Exception e) {                                                     // klasa nadrzêdna wyj¹tków,
            System.out.println("Nie przewidziany wyj¹tek");
            e.printStackTrace();                                                    // informuje nas w której linijce jest b³¹d
            // } catch (StringIndexOutOfBoundsException e) {                        zamiast rozbijaæ na poszczgólne catche mo¿emy je po³¹czyæ wy¿ej
            //      System.out.println("Chcesz dostaæ siê elementu tablicy poza jej rozmiar");
        } finally {                                                                 // to co tutaj mamy zapisane po finally ZAWSZE nam sie wyswietli
            System.out.println("Zawsze wyst¹pi, w koñcu finally");
        }
        System.out.println(".....");
    }
}

