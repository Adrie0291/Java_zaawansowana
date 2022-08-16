package Day18.Chel2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Customer {
    private List<Order> orders;
    private String name;
    private LocalDate birthday;

    public Customer(List<Order> orders, String name, LocalDate birthday) {
        this.orders = orders;
        this.name = name;
        this.birthday = birthday;
    }
    public double howMuchSpent(){
        return orders.stream() // bierzemy zamówienia
                .flatMap(order -> order.getProducts().stream())//przerzuca je w produkty
                .mapToDouble(product -> product.getFullPrice()) // z produktów bierzemy full price
                .sum(); // wszystko sumujemy
    }

    public int getAge2(){
        return birthday.until(LocalDate.now()).getYears(); // gdy nie sprecyzujemy mamy Period - jakiœ okres czasowy
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
           //     "orders=" + orders +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        return (int) birthday.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
