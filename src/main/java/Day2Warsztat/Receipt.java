package Day2Warsztat;

public class Receipt {
    private String repairTyp;
    private double totalPrice;
    private int count;
    private double price;

    public Receipt(String repairTyp, double price, int count) {
        this.repairTyp = repairTyp;
        totalPrice = price * count;
        this.count = count;
        this.price = price;
    }

    public void printReceipt() {
        System.out.printf("Typ naprawy %s, ilo�� %d, cena %.2f z�, ��czna cena: %.2f z� \n"
                , repairTyp, count, price, totalPrice);
    }
}
