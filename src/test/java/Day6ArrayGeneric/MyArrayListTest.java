package Day6ArrayGeneric;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private List<Integer> elements = new MyArrayList<>();

    @Test
    public void addShouldHandleFewElements() {

        //given


        //when
        elements.add(23);
        elements.add(11);
        elements.add(19);
        elements.add(98);

        //then
        assertEquals(4, elements.size());
    }

    @Test
    public void addShouldHandleManyElements() {

        //given
        elements.add(23);
        elements.add(11);
        elements.add(19);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98);
        elements.add(98); // 13 element
        assertEquals(13, elements.size());

    }

    @Test
    public void itsImpossibleToAddNullValue() {
        // List<Integer>...
        // when
        elements.add(null);
        assertEquals(0, elements.size());


    }
}
