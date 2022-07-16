package Day5.Excep;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = null; // bardzo �atwo nara�amy si� na null pointer

        try {
            text.toUpperCase(); // dowolna metoda wywo�a null poiner
            System.out.println("To si� nie pokaze, je�li z�apie wyj�tek.");
        } catch (NullPointerException e) {
            System.out.println("Wyst�pi� nullpointer");
        } finally {
            System.out.println("Zawsze wyst�pi");
        }
        System.out.println(".....");
    }
}


