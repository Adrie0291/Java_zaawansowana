package Day2Warsztat;

import java.util.Arrays;
/*
1. Stworzenie 4 opon, umieszczenie jej w tablicy.
2. Stworzenie klasy Wheel i nadanie jej cech
3. Stworzenie klasy Car ktora posiada ko³a.
4. Metoda psuj¹ca oponê za pomoca metody w klasie Main -> Car - > Wheel
5. Naprawianie opony w klasie Garage. argumentem metody jest obiekt typu Car.
6. Naprawianie metody Main -> Garage -> Wheel
7. Paragon za wykonane us³ugi. Osobny obiekt. Paragon
8. Metoda repaircar zwraca rachunek wiêc j¹ przyjmuje.
9. Wywo³anie metody drukowania paragonu.
KONIEC
 */
public class Main {
    public static void main(String[] args) {
        Wheel wheels[] = new Wheel[4];
        wheels[0] = new Wheel(2.2);
        wheels[1] = new Wheel(2.2);
        wheels[2] = new Wheel(2.4);
        wheels[3] = new Wheel(2.4);

        System.out.println(wheels[0]);
        System.out.println(Arrays.toString(wheels));

        Car car = new Car(wheels);
        System.out.println(car);

        car.flatRandomTire();
        car.flatRandomTire();
        car.flatRandomTire();
        System.out.println(car);
        Garage garage = new Garage(); //
        Receipt receipt = garage.repairCar(car); // 8* wywo³anie paragonu, obiekt Receipt
        receipt.printReceipt();
        System.out.println(car);

    }
}
