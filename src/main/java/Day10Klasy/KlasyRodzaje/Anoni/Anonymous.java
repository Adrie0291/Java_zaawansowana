package Day10Klasy.KlasyRodzaje.Anoni;

public class Anonymous {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bird = new Animal() {
            @Override
            public void makeNoise() {
                System.out.println("Æwir æwir æwir");
            }
        };
        bird.makeNoise();

        SimpleAnonymous simpleAnonymous = new SimpleAnonymous() {

            @Override
            public void tekst() {
                System.out.println("Jakis tekst");

            }
        };
        simpleAnonymous.tekst();

        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm anonymous runnable");
            }
        };
        myAnonymousRunnable.run();
        System.out.println("Nazwa klasy :" + myAnonymousRunnable.getClass());
    }

}
