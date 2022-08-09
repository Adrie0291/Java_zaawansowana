package Day17;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        Product product1 = new Product("Sugar", 9, 1);
        Product product2 = new Product("Milk", 3, 40);
        Product product3 = new Product("Cat's food", 6, 10);
        Product product4 = new Product("Paper", 10, 20);
        Product product5 = new Product("Flour", 2.5, 4);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        // Wyœwietl produkty które kosztuj¹ mniej ni¿ 5 z³
        List<Product> odfiltrowane = products.stream()
                .filter(product -> product.getPrice() < 5)
                .collect(Collectors.toList()); // zwraca odfiltrowane produkty do nowej listy
        //  .forEach(product -> System.out.println(product)); wyœwietla ca³a listê
        System.out.println(odfiltrowane);

        System.out.println("Posortowane ze wzglêdu na cenê produktu: ");
        // sortowanie wg ceny
        List<Product> posortowane = products.stream()
                .sorted((prod1, prod2) -> Double.compare(prod1.getPrice(), prod2.getPrice()))
                .toList();
        System.out.println(posortowane);

        System.out.println("Iloœc produktów tañsza ni¿ 10 z³ i których iloœæ jest mniejsza ni¿ 10");
        products.stream()
                .filter(product -> product.getPrice() < 10) // odfiltrowanie ze wzglêdu na cenê
                .map(product -> product.getAmount()) // przekszta³cenie z typu produktu na iloœæ
                .filter(amount -> amount < 10)      // kolejne filtrowanie, te produkty których iloœc jest mniejsza ni¿ 10
                .forEach(amount -> System.out.println(amount));


        System.exit(0);
        // wyœwietlenie ca³ej listy
        products.forEach(product -> System.out.println(product));


        //wyœwietlenie ³¹cznej iloœci produktów

        // nie mo¿na u¿ywac zmiennych lokalnych w lambdzie, chyba ¿e s¹ finalne
        int counter = 0;
        MyInt myInt = new MyInt();
        myInt.number = 0;
        products.forEach(product -> {
            myInt.number += product.getAmount();

        });
        System.out.println(counter);
    }
}
