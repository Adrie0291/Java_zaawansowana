package Day5.Excep;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("Start");
        String text = null; // bardzo ³atwo nara¿amy siê na null pointer

        try {
            text.toUpperCase(); // dowolna metoda wywo³a null poiner
            System.out.println("To siê nie pokaze, jeœli z³apie wyj¹tek.");
        } catch (NullPointerException e) {
            System.out.println("Wyst¹pi³ nullpointer");
        } finally {
            System.out.println("Zawsze wyst¹pi");
        }
        System.out.println(".....");
    }
}


