package Day18.Chel2;

enum Country {
    POLAND,
    CHINA,
    USA,
    JAPAN;
}

public class Product {
    private String name;
    private int amount;
    private double price;
    private Country country;

    public Product(String name, int amount, double price, Country country) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", country=" + country +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public double getFullPrice(){
        return price * amount;
    }
    public double getPrice() {
        return price;
    }
}
