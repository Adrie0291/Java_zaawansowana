package Day2PostOffice;

import java.util.Random;

public class OtherPeople {

    private static String[] senders = new String[]{"Adam", "Eliza", "Jacek", "Monika", "Janusz", "Mariusz", "Beata", "Anotni"};
    private static String[] receipients = new String[]{"Kamil", "Patryk", "Andzelika", "Wojtek", "Maciej", "Natalia", "Ola", "Sabinian"};
    private static final Random random = new Random();

    public String otherSender() {
        int number = random.nextInt(senders.length);
        return senders[number];
    }

    public String otherReceipient() {

        int number = random.nextInt(receipients.length);
        return receipients[number];
    }

    public int randomWeight() {
        int k = random.nextInt(100);
        return k;
    }

    public boolean randomPriority() {
        return random.nextBoolean();
    }
}
