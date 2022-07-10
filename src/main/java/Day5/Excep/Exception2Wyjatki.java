package Day5.Excep;

public class Exception2Wyjatki {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = "ziemia";

        try {
            String result = text.toUpperCase();
            System.out.println(result);
            System.out.println("To si� wy�wietli jeszcze w bloku try");
            System.out.println(text.charAt(100));
            System.out.println(10 / 0);                                             // w tym momencie to w ogole sie nie zostanie wykonane przez blad w linijce 12
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {        // po��czony catch z linijki 19
            System.out.println("Wyst�pi� nullpointer lub BoundsException");
        } catch (Exception e) {                                                     // klasa nadrz�dna wyj�tk�w,
            System.out.println("Nie przewidziany wyj�tek");
            e.printStackTrace();                                                    // informuje nas w kt�rej linijce jest b��d
            // } catch (StringIndexOutOfBoundsException e) {                        zamiast rozbija� na poszczg�lne catche mo�emy je po��czy� wy�ej
            //      System.out.println("Chcesz dosta� si� elementu tablicy poza jej rozmiar");
        } finally {                                                                 // to co tutaj mamy zapisane po finally ZAWSZE nam sie wyswietli
            System.out.println("Zawsze wyst�pi, w ko�cu finally");
        }
        System.out.println(".....");
    }
}

