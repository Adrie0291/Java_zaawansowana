package Day2PostOffice;

import java.util.Random;

public class OtherPeople {
    private String[] senders = new String[]{"Adam", "Ewelina", "Krzysztof", "Maciej", "£ukasz"};
    private String[] receivers = new String[]{"Waldemar", "Estera", "Konrad", "Mlawina", "Lucjan"};
    private Random random = new Random();

    public String otherSender() {
        int number = random.nextInt(senders.length);
        return senders[number];
    }

    public String otherReceiver() {
        int number = random.nextInt(receivers.length);
        return receivers[number];
    }

    public int randomWeight() {
        int ranWeight = random.nextInt(100000) + 1;
        return ranWeight;
    }

    public boolean randomPriority() {
        return random.nextBoolean();
    }
}
