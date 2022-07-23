package Day2PostOffice;

public class Letter {
    private Adres addressSender;
    private Adres addressReceiver;
    private boolean isPriority;
    String status = "stworzony";

    private int price;


    @Override
    public String toString() {
        return "Letter{" +
                "addressSender=" + addressSender +
                ", addressReceiver=" + addressReceiver +
                ", isPriority=" + isPriority +
                ", status='" + status + '\'' +
                '}';
    }

    public Letter(Adres addressSender, Adres addressReceiver, boolean isPriority) {
        this.addressSender = addressSender;
        this.addressReceiver = addressReceiver;
        this.isPriority = isPriority;

    }

    public double price() {
        if (isPriority = true) {
            return 8.5;
        }
        return 6;
    }

    public void changeStatus() {
        status = "wys³any";
    }
}
