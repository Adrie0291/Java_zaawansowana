package Day18;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEachDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Monika");
        names.add("Albert");
        names.add("Waldemar");
        names.add("Bartek");
        names.add("And¿elika");

        names.forEach(name -> {
            if (name.length() == 6)
                System.out.println(name);
        });
    }
}

 /*  2. Metoda za pomoc¹ klasy anonimowej
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

  */


  /*  1. Prosta metoda
        for (String name : names) {
            if (name.length() == 6)
            System.out.println(name);

        }

  */
