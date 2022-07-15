package Day3;

public class STRINGI_IMMUTABLE {
    public static void main(String[] args) {
        String name = "Adrian";
        String secondName = "Adrian";
        String thirdName = new String("Adrian");

        System.out.println(name == secondName);
        System.out.println(name == thirdName);
        System.out.println(name.equals(thirdName));
    }
}
