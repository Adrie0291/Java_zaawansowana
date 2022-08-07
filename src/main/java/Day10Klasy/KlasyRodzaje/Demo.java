package Day10Klasy.KlasyRodzaje;

public class Demo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyThere();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.whatsUp();


        OuterClass.InnerStatic innerStatic = new OuterClass.InnerStatic();
        innerStatic.welcomeAll();

    }
}