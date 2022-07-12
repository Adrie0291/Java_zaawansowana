package Day4Dziedziczenie.DziedziczenieZajecia;

public class AnimalDemo {
    public static void main(String[] args) {
        /*
        Cat monkey = new Cat();
        Cat monkey2 = new Cat("Filutek", 8, 20);

        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek", 45, 7);

        monkey.jump();      // ma³pa nr 1
        monkey.uhahaha();

        whale.booing();     // wieloryb nr 2
        whale.swim();

        System.out.println("Wspólna metoda: ");
        monkey.eat();
        whale.eat();
        System.out.println("Wspólna lista");
        List<Animal> animals = new ArrayList<>(); // wspólny typ Zwierze,
        animals.add(monkey);
        animals.add(monkey2);
        animals.add(whale);
        animals.add(whale2);

        for (Animal animal : animals) {
            // jedyna widocznoœæ dla metod wspólnych, gdy u¿yuwamy wspólnego typu !
            animal.eat();
            System.out.println("----");
        }


        System.out.println("--------- Zwierze Guide -------------");
        AnimalGuide animalGuide = new AnimalGuide();

         */
        //   animalGuide.feedMonkey(monkey); 1. metoda nie robiæ tak
        //   animalGuide.feedWhale(whale);   1. metoda nie robiæ tak
      //  animalGuide.feedAnimal(monkey);
        //  animalGuide.feedAnimal(whale);

        // POLIMORFIZM

        System.out.println("--------POLIMORFIZM------");
        Animal animal = new Whale(); // ogólna zmienna animal (dowolne zwierze) = new Wieloryb() obiekt typu Wieloryb !

        animal.makeSound(); // klasa Zwierze nie ma metody, ale najpierw wykonuje metode z danej klasy, jesli tam nic nie ma przechodzi do wspolnej klasy !
        animal = new Monkey(); // animal to zmienna ! tutaj zmieniamy ta zmienna na inny obiekt (ma³pa)
        animal.makeSound(); // wyswietli sie metoda na klasie Malpa !

        /*POLIMORFIZM - ró¿nego rodzaju obiekty mo¿emy wstawiaæ do tego samego typu zmiennej, a wiêc metody tej zmiennej bêd¹ dostosywaæ
          siê do tego jak dany obiekty jaki tam jest tam nadpisuje
         zdolnoœæ jêzyka obiektowego do umieszczania we wspólnej zmiennej ró¿nych typów obiektów
         metody takiej zmiennej dostoswuj¹ swoje dzia³anie w zale¿noœci jak dany obiekt j¹ nadpisaæ
         najwa¿niejsza w³aœciwoœæ programowania obiektowego (niski poziom skomplikowania projektu, ³atwoœæ dodawania kolejnych funkcjonalnoœci
         dok³adanie nowych klas dziedzicz¹cych po wspólnej klasie, która jest w u¿yciu w aplikacji
         nie dziedziczymy tylko metod, ale równie¿ typ ! */




        // Poni¿ej bardzo wa¿ny bl¹d podczas polimorfizmu, nie mo¿emy  tworzyæ obiektu
        // Z abstrakcyjnej klasy nie mo¿na robiæ obiektów ! mog¹ mieæ abstrakcyjne metody
        // animal = new Zwierze();
        //  animal.makeSound();

        animal = new Cow();
        animal.makeSound();

    }


}