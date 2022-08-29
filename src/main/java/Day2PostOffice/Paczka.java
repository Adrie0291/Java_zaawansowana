package Day2PostOffice;

public class Paczka {
    private String sender;
    private String receiver;
    private double weight;
    private boolean priority;
    private Status packageStatus = Status.CREATED;

    public Paczka(String sender, String receiver, double weight, boolean priority) {
        if (sender.isEmpty()) {
            System.out.println("Wysy³aj¹cy nie mo¿e mieæ pustego pola");
            return;
        } else if (receiver.isEmpty()) {
            System.out.println("Adresat nie mo¿e mieæ pustego pola");
            return;
        } else if (weight < 0 || weight > 100000) {
            System.out.println("Paczka musi mieæ wagê zakresie: 1g - 100.000g");
            return;
        }
        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;
        this.priority = priority;
    }
//    public Paczka(){
//        OtherPeople randomPeople = new OtherPeople();
//        sender = randomPeople.otherSender();
//        receiver = randomPeople.otherReceiver();
//        weight = randomPeople.randomWeight();
//        priority = randomPeople.randomPriority();


    public double costPackage() {
        double cost = 0;
        if (weight > 0 && weight < 500) {
            cost = 5.0;
        } else if (weight >= 500 && weight < 1000) {
            cost = 8.0;
        } else if (weight >= 1000 && weight < 2000) {
            cost = 12.0;
        } else {
            cost = 12.0 + (weight - 2000) / 1000;
            cost = Math.ceil(cost);
        }
        if (priority) {
            cost = cost + cost * 0.1;
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Paczka{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                '}';
    }
}
