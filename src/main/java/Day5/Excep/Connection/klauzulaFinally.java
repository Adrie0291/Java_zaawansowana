package Day5.Excep.Connection;

public class klauzulaFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Otrzymujê: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // b³¹d dzielenia przez 0
                    break;
                case 1:
                    nums[4] = 4; // b³¹d indeksu tablicy
                    break;
                case 2:
                    return; // powrót z bloku try
            }
        } catch (ArithmeticException e) { // wy³apuje wyj¹tek zwi¹zany z oepracjami arytmetycznymi
            System.out.println("Nie dziel przez 0!");
            return; // powrót z catch
        } catch (
                ArrayIndexOutOfBoundsException e) { // wyj¹tek zwiazany z proba dostania sie do wartosci w tablicy wykraczajacej poza rozmiar tablicy
            System.out.println("Brak odpowiedniego elementu tablicy");
        } finally {
            System.out.println("Opuszczam blok try");
        }
    }
}
class Finally {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            klauzulaFinally.genException(i);
            System.out.println();
        }
    }
}