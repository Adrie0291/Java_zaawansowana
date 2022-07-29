package WzorceProjektowe.Dzien1;

import lombok.Builder;
import lombok.Data;

//@AllArgsConstructor
//@Builder
//@ToString
@Data  // konstruktory + toString + gettery + settery jednocześnie !
@Builder
public class User {
    private String name;
    private String surname;
    private int age;
    private int foot;
    private int height;
    private String nationality;
    private String eyesColor;
    private String hairColor;
// to poniżej dzięki Builder
    public static void main(String[] args) {
        User user = User.builder()
                .name("Waldemar")
                .surname("Kowalski")
                .age(30)
                .build();

        System.out.println(user);
    }

}
