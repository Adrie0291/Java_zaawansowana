package WzorceProjektowe.Day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassErrorTest {

    @Test
    void shouldSumNumbers() {

        int firstNumber = 5;
        int secondNumber = 10;
        int excpected = 15;

        int actual = ClassError.sumNumber(firstNumber, secondNumber, "pustka"); // property show siema
        Assertions.assertEquals(excpected, actual);
    }
}