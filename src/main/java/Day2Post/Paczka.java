package Day2Post;

public class Paczka {
    private String sender;
    private String receiver;
    private double weight;
    private boolean isPrority;

    public Paczka(String sender, String receiver, double weight) {
        if (sender == null || sender.isEmpty() || receiver == null || receiver.isEmpty()) {
            System.out.println("Odbiorca lub nadawca nie mo¿e byc pusty");
            return;
        } else if (weight < 1 || weight > 100_000) {
            System.out.println("Nieprawid³owa waga");
            return;
        }

        this.sender = sender;
        this.receiver = receiver;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Paczka{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", weight=" + weight +
                '}';
    }
}
