package Day9Set.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyFlower {
    public static void main(String[] args) {
        Set<Flower> kwiaty = new HashSet<>();
        Flower kwiaty1 = new Flower("róża");
        Flower kwiaty2 = new Flower("trawa");
        Flower kwiaty3 = new Flower("słonecznik");
        Flower kwiaty4 = new Flower("lawenda");
        Flower kwiaty5 = new Flower("trawa");


        kwiaty.add(kwiaty1);
        kwiaty.add(kwiaty2);
        kwiaty.add(kwiaty3);
        kwiaty.add(kwiaty4);
        kwiaty.add(kwiaty5);

        System.out.println(kwiaty);

        Flower kwiaty6 = kwiaty2;
        //Domyślnie equals wykorzystuje == do porównania
        System.out.println(kwiaty2.hashCode());         // 1452126962
        System.out.println(kwiaty5.hashCode());         // 764977973
        System.out.println(kwiaty6.hashCode());         // 1452126962

        System.out.println(kwiaty2.equals(kwiaty5));    // przed nadpisaniem : false // po nadpisaniu : true
        System.out.println(kwiaty2.equals(kwiaty6));    //true

        System.out.println(kwiaty2 == kwiaty5);         // false // 'INNE' obiekty
        System.out.println(kwiaty2 == kwiaty6);         //true, te same obiekty fizycznie w pamięci
    }
}
