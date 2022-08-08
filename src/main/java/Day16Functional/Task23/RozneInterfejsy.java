package Day16Functional.Task23;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RozneInterfejsy {

    public static void main(String[] args) {

        //a
        Supplier losowaLiczba = () -> {
            Random random = new Random();
            return random.nextInt(10) + 1;
        };
        System.out.println(losowaLiczba.get());

        //b
        String password = "admin1234";

        Predicate isPasswordValid = somePassword -> String.valueOf(password).length() >= 5;
        System.out.println(isPasswordValid.test(password));

        //c
        Comparator compareLength = (word1, word2) -> {
            if (String.valueOf(word1).length() > String.valueOf(word2).length()) {
                System.out.println("Word 1 is a longer");
                return 1;
            } else if (String.valueOf(word1).length() < String.valueOf(word2).length()) {
                System.out.println("Word 2 is a longer");
                return -1;
            } else {
                System.out.println("have the same length ");
                return 0;

            }
        };

        System.out.println(compareLength.compare("domek", "pierzyna"));


    }

}
