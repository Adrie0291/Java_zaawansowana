package Day6ArrayGeneric;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class ListTest {

    private List<Integer> elements;

    public ListTest(List<Integer> elements) {
        this.elements = elements;
    }

    @Test
    public void addShouldHandleFewElements() {

        //given


        //when
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(23);
        elements.add(11);
        //  elements.add(19);
        //  elements.add(98);

        //then
        assertEquals(13, elements.size());
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
        elements.add(22);
        elements.add(33);
        elements.add(44);
        elements.add(55);

        elements.add(2, 11);

        assertEquals(5, elements.size());
        assertEquals(11, elements.get(2));

    }// przesuwanie elementow

    @Test
    public void shouldFindMatching() {
        elements.add(6);
        elements.add(12);
        elements.add(9);
        elements.add(2);

        boolean shouldFind = elements.contains(12);
        boolean shouldNotFind = elements.contains(10);

        assertTrue(shouldFind);
        assertFalse(shouldNotFind);
    }

    @Test
    public void remove() {
        elements.add(6);
        elements.add(12);
        elements.add(9);
        elements.add(2);

        elements.remove(1);

        assertEquals(6, elements.get(0));
        assertEquals(9, elements.get(1));
        assertEquals(2, elements.get(2));

    }

    @Test
    public void setMethod() {
        elements.add(20);
        elements.add(1);
        elements.add(7);
        elements.add(8);

        elements.set(2, 33);

        assertEquals(20, elements.get(0));
        assertEquals(1, elements.get(1));
        assertEquals(33, elements.get(2));
        assertEquals(7, elements.get(3));
        assertEquals(8, elements.get(4));

    }

    @Test
    public void addShouldHandleOneElement() {
        elements.add(10);

        assertEquals(1, elements.size());
        assertEquals(10, elements.get(0));
    }
}
