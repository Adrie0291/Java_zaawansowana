package Day9Set.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyPrzyklad {
    public static void main(String[] args) {
        Set<String> zwierzeta = new HashSet<>();
        zwierzeta.add("Krowa");
        zwierzeta.add("Kon");
        zwierzeta.add("Pies");
        zwierzeta.add("Kangur");
        zwierzeta.add("Jastrzab");
        zwierzeta.add("Waz");
        System.out.println("Wyświetlanie za pomoca SOUT:");
        System.out.println(zwierzeta);

        System.out.println("For each petla");
        for (String s : zwierzeta) {
            System.out.println(zwierzeta);

        }
    }

}
