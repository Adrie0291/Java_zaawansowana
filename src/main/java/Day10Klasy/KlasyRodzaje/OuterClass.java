package Day10Klasy.KlasyRodzaje;

public class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey ! ");

        class LocalInnerClass {
            String localInnerClassVariable = "Adrian";

            public void printLocalClassVariable() {
                System.out.println(localInnerClassVariable);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalClassVariable();
    }

    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("What's up ");
        }
    }

    public static class InnerStatic {
        int staticNumber = 9;

        public void welcomeAll() {
            System.out.println("Hi everyboy");
        }
    }
}