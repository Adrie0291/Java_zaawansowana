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

    @Test
    public void shouldThrowExceptionWhenOutofBound1() {
        try {
            elements.get(100);
        } catch (Exception e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void shouldThrowExceptionWhenOutofBound2() {
        try {
            elements.get(13);
            //  elements.get(3);
        } catch (Exception e) {
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
            return;
        }
        fail();
    }

    /*
     // 5,3,12,98 <- wartoœci =4 actualSize
        // 0,1,2,3, <- pozycja   | zaczynamy od konca, musimy miec dostep do ost. elementu
        // * dzia³anie pêtli
        // 5,3,12,98,98
        // * dzialanie pêtli
        // 5,3, 12, 12,98  dzia³anie pêtli
        // 5, 3, 3 , 12, 98
        //5, 723 ,3, 12 , 98   <-- dodajemy 723 liczbe jak to zrobic
     */
    @Test
    public void shouldMakeRoomForNewNumber() {
        elements.add(5);
        elements.add(3);
        elements.add(12);
        elements.add(98);

        elements.add(1, 723);

        assertEquals(5, elements.size());
        assertEquals(723, elements.get(1));
        assertEquals(5, elements.get(0));
        assertEquals(3, elements.get(2));
        assertEquals(12, elements.get(3));
        assertEquals(98, elements.get(4));
    }// przesuwanie elementow
    @Test
    public void shouldFindMatching(){
        elements.add(6);
        elements.add(12);
        elements.add(9);
        elements.add(2);

        boolean shouldFind = elements.contains(12);
        boolean shouldNotFind = elements.contains(10);

        assertTrue(shouldFind);
        assertFalse(shouldNotFind);
    }
}
