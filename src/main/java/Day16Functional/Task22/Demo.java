package Day16Functional.Task22;

public class Demo {
    public static void main(String[] args) {
        Printer newText = (text) -> System.out.println(text.toUpperCase() + " !");

        Printer newWord = (text) -> {
            String res = "";
            String[] words = text.split("\s");
            for (int i = 0; i < words.length; i++) {
                res += words[i].charAt(0);
            }
            System.out.println(res);
        };
        newText.print("tekst wielkimi literami");
        newWord.print("jak Ala ma na imie k");
    }
}
