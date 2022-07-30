package Day9Set.Sety;

import java.util.HashSet;
import java.util.Set;

public class Kolekcje11 {
    public static void main(String[] args) {
        Set<String> potrawy = new HashSet<>();
        potrawy.add("schabowy");
        potrawy.add("pizza");
        potrawy.add("pstrag");
        potrawy.add("pomidorowa");
        potrawy.add("bigos");
        potrawy.add("schabowy");

        for (String s : potrawy) {
            System.out.println(s.toUpperCase());

        }

    }
}