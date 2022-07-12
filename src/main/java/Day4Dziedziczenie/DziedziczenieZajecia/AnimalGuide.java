package Day4Dziedziczenie.DziedziczenieZajecia;

import Day4Dziedziczenie.DziedziczenieZajecia.Animal;

public class AnimalGuide {

    public void feedAnimal(Animal animal) { // zmieniamy typ Zwierze (wsp�lny dla obu klas)
        System.out.println("Opiekun karmi  zwierz�tko: ");
        animal.eat();
        animal.makeSound();
    }
}
    /* 1. Metoda. Tak nie robi� !
        public void feedMonkey(Malpa monkey) {
            System.out.println("Opiekun karmi ma�p�: ");
            monkey.eat();
            monkey.uhahaha();
        }

        public void feedWhale(Wieloryb whale) {
            System.out.println("Opeikun karmi wieloryba");
            whale.eat();
            whale.booing();
        }
    }
         */
    /* 2.Metoda zbyt czasoch�onna. Trzeba dok�ada� kolejnego if else do ka�dego zwierz�cia.
    public void feedAnimal(Zwierze animal) { // zmieniamy typ Zwierze (wsp�lny dla obu klas)
        System.out.println("Opiekun karmi  zwierz�tko: ");
        animal.eat();  // tutaj problemu nie ma
        if (animal instanceof Malpa) {
            //animal = new Wieloryb();
            Malpa monkey = (Malpa) animal;
            monkey.uhahaha();
        } else if (animal instanceof Wieloryb) {
            Wieloryb whale = (Wieloryb) animal;
            whale.booing();
        }
    }

     */
