package Day18.Chel2;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;


public class Order {
    private List<Product> products;
    private LocalDateTime orderTime;

    public Order(List<Product> products) {
        this.products = products;
        orderTime = getRandomTime();
    }

    private LocalDateTime getRandomTime() {
        return LocalDateTime.now().minusDays(new Random().nextInt(14));

    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;


    }



    @Override
    public String toString() {
        return "\n" + "Order{" +
                //   "products=" + products +
                ", orderTime=" + orderTime +
                '}';

    }
}

