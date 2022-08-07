package Day15.RunnablePodstawa2;

public class Main {
    public static void main(String[] args) {
        Thread dzialanie1 = new Thread(new Dzialanie());
        Thread dzialanie2 = new Thread(new Dzialanie());

        dzialanie1.start();
        dzialanie2.start();
    }
}
