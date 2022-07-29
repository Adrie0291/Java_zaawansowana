import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WzorceTest {

    @Test
    void addNumbers() {
        int firstNumber = 5;
        int secondNumber = 12;
        int expected = 17;
        int actual = Wzorce.addNumbers(firstNumber, secondNumber, "cos");

        Assertions.assertEquals(expected, actual);
    }
}