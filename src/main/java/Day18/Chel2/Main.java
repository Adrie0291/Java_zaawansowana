package Day18.Chel2;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product("fasola", 10, 1, Country.POLAND);
        Product product2=new Product("Coca-Cola", 7, 6, Country.USA);
        Product product3=new Product("Banan", 20, 4, Country.CHINA);
        Product product4=new Product("Krem do r?k", 3, 20, Country.JAPAN);
        Product product5=new Product("D?ugopis", 10, 2.5, Country.POLAND);

        Order order=new Order(new ArrayList<>(List.of(product1, product2, product4, product3)));
        Order order2=new Order(new ArrayList<>(List.of( product2, product4, product3)));
        Order order3=new Order(new ArrayList<>(List.of(product1, product4, product3, product5)));
        Order order4=new Order(new ArrayList<>(List.of(product1,  product4, product3,  product3)));
        Order order5=new Order(new ArrayList<>(List.of(product1, product2, product3, product4, product3)));

        Customer customer=new Customer(new ArrayList<>(List.of(order)), "Jacek", LocalDate.now().minusYears(20));
        Customer customer2=new Customer(new ArrayList<>(List.of(order2, order5, order3)), "Wojtek", LocalDate.now().minusYears(25));
        Customer customer3=new Customer(new ArrayList<>(List.of(order2, order4)), "Krzysiek", LocalDate.now().minusYears(15));
        Customer customer4=new Customer(new ArrayList<>(List.of()), "Kamil", LocalDate.now().minusYears(19));
        Customer customer5=new Customer(new ArrayList<>(List.of(order5)), "Adrian", LocalDate.now().minusYears(40));

        Shop shop=new Shop(new ArrayList<>(List.of(customer, customer2, customer3, customer4, customer5)));
        System.out.println("Oders: ");
        System.out.println(order);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println("-------");
        System.out.println("Imiona klientów:");
        System.out.println(shop.getCustomersNames());
        System.out.println("Średnia wieku: ");
        System.out.println(shop.getAverageCustomers());
        System.out.println("-----------------");
        System.out.println("Lista list zkakpowych do 7 dni metoda zwykła");
        System.out.println(shop.getNewOrders());
        System.out.println("Lista osób mająca jakiekolwiek zamówienie");
        System.out.println(shop.findCustomersWithOrders());
        System.out.println("Lista 7 dni z metodą until");
        System.out.println(shop.getNewOrders2());
        System.out.println("Posortowana lista osób pełnoletnich");
        System.out.println(shop.findMatureCustomerSortedByAge());
        System.out.println("Średnia ilość produktów zamówiona na osobę: ");
        System.out.println(shop.findAverageProductAmountOfAllPeople());
        System.out.println("Średnia cena na osobę: ");
        System.out.println(shop.findAveragePricefromAllOrders());
        System.out.println("Ilośc wszystkich zamówień ");
        System.out.println(shop.findAllOrders());
        System.out.println("Średnia ilość produktu przypadająca na jedno zamówienie");
        System.out.println(shop.findAveragePiecesFromAllOrders());
        System.out.println("Kto wydał najwięcej");
        System.out.println(shop.findTheMostSpendingCustomer());
        System.out.println(shop.findTheMostSpendingCustomer2());
        System.out.println(shop.findTheMostSpendingCustomer3());
        System.out.println("Produkt którego jest najmniej");
        System.out.println(shop.findByMinAmountProduct());
        System.out.println("Zamowienia starsze niz 7 dni");
        System.out.println(shop.findLateProducts());
        System.out.println("XXX");
        System.out.println(shop.countCustomersBornInMonth());

    }
}
