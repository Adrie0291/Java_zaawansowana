package Day1RepeatObiect.Linie;

public class LiniaDemo {
    public static void main(String[] args) {
        Linia first = new Linia(4, "@");
        Linia second = new Linia(5, "*");
        Linia third = new Linia(9, "/");
        Linia four = new Linia();
        Linia five = new Linia(4, 'x');

        first.printLine();
        second.printLine();
        third.printLine();
        four.printLine();
        five.printLineChar();


        System.out.println(first);
        System.out.println(four);
        System.out.println(five);


    }
}
