package Day2PostOffice;

public class Paczka {

    // 100 kg = 100000g, zak³adamy wszystko w INT
    private String sender;
    private String recipient;
    private double weight;
    private boolean isPriority;
    String status = "utworzona";

    public Paczka(String sender, String recipient, double weight, boolean isPriority) {
        if (sender == "" || sender.isEmpty()) {
            System.out.println("Sender cannot be empty!");
            return;
        }
        if (recipient == "" || recipient.isEmpty()) {
            System.out.println("Receipient cannot be empty");
            return;
        }
        if (weight > 100 || weight < 0.001) {
            System.out.println("Weight values is from 0.001 do 100 kg");
            return;
        }
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.isPriority = isPriority;
    }

    public Paczka() {
        OtherPeople randomPeople = new OtherPeople();
        sender = randomPeople.otherSender();
        recipient = randomPeople.otherReceipient();
        weight = randomPeople.randomWeight();
        isPriority = randomPeople.randomPriority();
    }

    double totalPrice() {
        double price = 0;
        if (weight <= 0.5) {
            price = 5;
        } else if (weight > 0.5 && weight <= 1) {
            price = 8;
        } else if (weight > 1 && weight <= 2) {
            price = 12;
        } else if (weight > 2) {
            price = 12 + (weight - 2);
            price = Math.ceil(price);
        }
        if (isPriority) {
            price *= 1.1;
        }
        return price;
    }


    @Override
    public String toString() {
        return "Paczka{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", isPriority=" + isPriority +
                '}';
    }
}