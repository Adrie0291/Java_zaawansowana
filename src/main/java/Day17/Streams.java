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
        // Wy�wietl produkty kt�re kosztuj� mniej ni� 5 z�
        List<Product> odfiltrowane = products.stream()
                .filter(product -> product.getPrice() < 5)
                .collect(Collectors.toList()); // zwraca odfiltrowane produkty do nowej listy
        //  .forEach(product -> System.out.println(product)); wy�wietla ca�a list�
        System.out.println(odfiltrowane);

        System.out.println("Posortowane ze wzgl�du na cen� produktu: ");
        // sortowanie wg ceny
        List<Product> posortowane = products.stream()
                .sorted((prod1, prod2) -> Double.compare(prod1.getPrice(), prod2.getPrice()))
                .toList();
        System.out.println(posortowane);

        System.out.println("Ilo�c produkt�w ta�sza ni� 10 z� i kt�rych ilo�� jest mniejsza ni� 10");
        products.stream()
                .filter(product -> product.getPrice() < 10) // odfiltrowanie ze wzgl�du na cen�
                .map(product -> product.getAmount()) // przekszta�cenie z typu produktu na ilo��
                .filter(amount -> amount < 10)      // kolejne filtrowanie, te produkty kt�rych ilo�c jest mniejsza ni� 10
                .forEach(amount -> System.out.println(amount));


        System.exit(0);
        // wy�wietlenie ca�ej listy
        products.forEach(product -> System.out.println(product));


        //wy�wietlenie ��cznej ilo�ci produkt�w

        // nie mo�na u�ywac zmiennych lokalnych w lambdzie, chyba �e s� finalne
        int counter = 0;
        MyInt myInt = new MyInt();
        myInt.number = 0;
        products.forEach(product -> {
            myInt.number += product.getAmount();

        });
        System.out.println(counter);
    }
}
