package Day17.Challenge1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class PersonImpl extends Person {
    private static Random random = new Random();

    public PersonImpl(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {
        Random random = new Random();
        return random.nextInt(101);
    }

    @Override
    public LocalDate getRandomBirthDate() {
        return LocalDate.now()
                .minusYears(random.nextInt(100) + 1)
                .minusDays(random.nextInt(365) + 1);
    }

    @Override
    public int getAge() {
        return (int) birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
