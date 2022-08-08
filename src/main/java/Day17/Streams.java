package Day17;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
