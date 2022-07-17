package Day5.Excep.Connection;

public class klauzulaFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Otrzymuj�: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // b��d dzielenia przez 0
                    break;
                case 1:
                    nums[4] = 4; // b��d indeksu tablicy
                    break;
                case 2:
                    return; // powr�t z bloku try
            }
        } catch (ArithmeticException e) { // wy�apuje wyj�tek zwi�zany z oepracjami arytmetycznymi
            System.out.println("Nie dziel przez 0!");
            return; // powr�t z catch
        } catch (
                ArrayIndexOutOfBoundsException e) { // wyj�tek zwiazany z proba dostania sie do wartosci w tablicy wykraczajacej poza rozmiar tablicy
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