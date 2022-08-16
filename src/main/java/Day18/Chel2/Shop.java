package Day18.Chel2;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Shop {
    private List<Customer> customers;

    public Shop(List<Customer> customers) {
        this.customers = customers;
    }

    //zwróć imiona customerów posortowane alfabetycznie
    public List<String> getCustomersNames() {
        return customers.stream()
                .map(customer -> customer.getName()) // zmiana z <Customer> na <String>
                .sorted()// sortowanie domyślnie alfabetycznie
                .toList(); // zapisanie do listy

    }

    //zwróć średni wiek customerów
    public double getAverageCustomers() {
        return customers.stream()
                .mapToInt(customer -> customer.getAge2())
                .average()
                .orElse(-1);

    }

    //zwróć customerów którzy mają jakieś zamówienia
    public List<Customer> findCustomersWithOrders() {
        return customers.stream()
                .filter(customer -> !customer.getOrders().isEmpty())
                .toList();
    }

    //zwróć tylko pełnoletnich customerów posortowanych po ich wieku
    public List<Customer> findMatureCustomerSortedByAge() {
        return customers.stream()
                .filter(customer -> customer.getAge() >= 18)
                .sorted((cus1, cus2) -> cus1.getAge() - cus2.getAge2())
                .toList();
    }

    //*zwróć zamówienia do 7 dni
    public List<Order> getNewOrders() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderTime().plusDays(7).isAfter(LocalDateTime.now()))
                .toList();
    }

    // *zwróc zamówienia do 7 dni metoda until
    public List<Order> getNewOrders2() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderTime().until(LocalDateTime.now(), ChronoUnit.DAYS) < 7)
                .toList();
    }

    public int howManyCustomer() {
        int count = 0;
        for (Customer customer : customers) {
            count++;
        }
        return count;
    }


    //zwróć średnią ilość produktów na osobę
    public double findAverageProductAmountOfAllPeople() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(product -> product.getAmount())
                .sum() / howManyCustomer();

    }

    //zwróć średnią kwotę produktów na osobę
    public double findAveragePricefromAllOrders() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(product -> product.getFullPrice())
                .sum() / howManyCustomer();

    }

    public int findAllOrders() {
        return (int) customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .count();
    }

    public double findAveragePiecesFromAllOrders() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(product -> product.getAmount())
                .sum() / findAllOrders();

//zwróć customera, który wydał najwięcej
    }

    public Customer findTheMostSpendingCustomer() {
        return customers.stream()
                .sorted((cus1, cus2) -> Double.compare(cus2.howMuchSpent(), cus1.howMuchSpent()))
                .findFirst()
                .orElseThrow();
    }

    public Customer findTheMostSpendingCustomer2() {
        return customers.stream()
                .max((cus1, cus2) -> Double.compare(cus1.howMuchSpent(), cus2.howMuchSpent()))
                .orElseThrow();
    }


    public Customer findTheMostSpendingCustomer3() {
        return customers.stream()
                .max((Comparator.comparingDouble(Customer::howMuchSpent)))
                .orElseThrow();

//zwróć produkt którego mamy najmniej (wg. amound)
    }

    public Product findByMinAmountProduct() {
        return getAllProducts()
                .min((prod1, prod2) -> prod1.getAmount() - prod2.getAmount())
                .orElseThrow();


    }

    private Stream<Product> getAllProducts() {
        return customers.stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream());
    }
//zwróć wszystkie produkty zamówione później niż tydzień temu
        public List<Product> findLateProducts(){
           return customers.stream()
                    .flatMap(customer -> customer.getOrders().stream())
                    .filter(order -> order.getOrderTime().minusDays(7).isBefore(LocalDateTime.now())) // znaczy ze sa starsze niż 7
                    .flatMap(order -> order.getProducts().stream())
                    .toList();
        }

//trudne:
//zwróć mapę której kluczem będzie numer miesiąca a wartością ilość customerów urodzonych w danym miesiącu
    public Map<Integer,Integer> countCustomersBornInMonth(){
        return IntStream.range(1,13)
                .boxed() // wychodzi ze streama  liczbowego do streama Objectow
                .collect(Collectors.toMap(month -> month, month ->getCustomersBornIn(month).size()));
    }

    private List<Customer> getCustomersBornIn(int month) {
        return customers.stream()
                .filter(customer -> customer.getBirthday().getMonthValue() == month)
                .toList();
    }
//zwróć mapę zawierającą kraj oraz ilość produktów pochodzących z tego kraju

}