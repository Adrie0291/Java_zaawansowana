package Day4Dziedziczenie.Interfejsy;

public class Main {
    public static void main(String[] args) {
        Kon kon = new Kon("Rafal", 33, "brazowy");
        Rekin rekin = new Rekin("Nemo", 9, 300);
        Zebra zebra = new Zebra("Pazurek", 12, 180);

        Animal animals[] = new Animal[3];
        animals[0] = kon;
        animals[1] = rekin;
        animals[2] = zebra;

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
        System.out.println("Zastosowanie polimorfizmu. Wa¿ny jest typ obiektu ! ");
        Animal animal1 = new Kon("Leszek", 29, "czarny");
        animal1.sleep();
        animal1 = new Zebra("Rabka", 39, 165);
        animal1.sleep();

        System.out.println("----");
        Opiekun opiekun = new Opiekun();
        opiekun.feedAnimal(kon);
        System.out.println("-------");
        FarmAnimal farmAnimal = new Kon(); // dziedziczymy typ, dzidziczymy abstrakcyjne metody
        farmAnimal.makeSound(); // nie ma normalnych metod, pol i konstruktorow, mozna implementowac wiele interefjsow
// interfejs moze jednak posiadac normalne metody, w ramach wyjatku jesli dodamy default do metody
        /*
      public default void metoda(){
      SOUT
      }
         */

    }
}
