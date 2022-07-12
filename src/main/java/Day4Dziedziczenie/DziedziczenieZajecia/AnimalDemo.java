package Day4Dziedziczenie.DziedziczenieZajecia;

public class AnimalDemo {
    public static void main(String[] args) {
        /*
        Cat monkey = new Cat();
        Cat monkey2 = new Cat("Filutek", 8, 20);

        Whale whale = new Whale();
        Whale whale2 = new Whale("Radek", 45, 7);

        monkey.jump();      // ma�pa nr 1
        monkey.uhahaha();

        whale.booing();     // wieloryb nr 2
        whale.swim();

        System.out.println("Wsp�lna metoda: ");
        monkey.eat();
        whale.eat();
        System.out.println("Wsp�lna lista");
        List<Animal> animals = new ArrayList<>(); // wsp�lny typ Zwierze,
        animals.add(monkey);
        animals.add(monkey2);
        animals.add(whale);
        animals.add(whale2);

        for (Animal animal : animals) {
            // jedyna widoczno�� dla metod wsp�lnych, gdy u�yuwamy wsp�lnego typu !
            animal.eat();
            System.out.println("----");
        }


        System.out.println("--------- Zwierze Guide -------------");
        AnimalGuide animalGuide = new AnimalGuide();

         */
        //   animalGuide.feedMonkey(monkey); 1. metoda nie robi� tak
        //   animalGuide.feedWhale(whale);   1. metoda nie robi� tak
      //  animalGuide.feedAnimal(monkey);
        //  animalGuide.feedAnimal(whale);

        // POLIMORFIZM

        System.out.println("--------POLIMORFIZM------");
        Animal animal = new Whale(); // og�lna zmienna animal (dowolne zwierze) = new Wieloryb() obiekt typu Wieloryb !

        animal.makeSound(); // klasa Zwierze nie ma metody, ale najpierw wykonuje metode z danej klasy, jesli tam nic nie ma przechodzi do wspolnej klasy !
        animal = new Monkey(); // animal to zmienna ! tutaj zmieniamy ta zmienna na inny obiekt (ma�pa)
        animal.makeSound(); // wyswietli sie metoda na klasie Malpa !

        /*POLIMORFIZM - r�nego rodzaju obiekty mo�emy wstawia� do tego samego typu zmiennej, a wi�c metody tej zmiennej b�d� dostosywa�
          si� do tego jak dany obiekty jaki tam jest tam nadpisuje
         zdolno�� j�zyka obiektowego do umieszczania we wsp�lnej zmiennej r�nych typ�w obiekt�w
         metody takiej zmiennej dostoswuj� swoje dzia�anie w zale�no�ci jak dany obiekt j� nadpisa�
         najwa�niejsza w�a�ciwo�� programowania obiektowego (niski poziom skomplikowania projektu, �atwo�� dodawania kolejnych funkcjonalno�ci
         dok�adanie nowych klas dziedzicz�cych po wsp�lnej klasie, kt�ra jest w u�yciu w aplikacji
         nie dziedziczymy tylko metod, ale r�wnie� typ ! */




        // Poni�ej bardzo wa�ny bl�d podczas polimorfizmu, nie mo�emy  tworzy� obiektu
        // Z abstrakcyjnej klasy nie mo�na robi� obiekt�w ! mog� mie� abstrakcyjne metody
        // animal = new Zwierze();
        //  animal.makeSound();

        animal = new Cow();
        animal.makeSound();

    }


}