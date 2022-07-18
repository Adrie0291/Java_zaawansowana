package Day6ArrayGeneric;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elemenets = (E[]) new Object[10];// myArrayList ma pod spodem zwyk�� tablic� typu E
    private int actualSize = 0; // domy�lnie wynosi 0, nie musimy pisa�,

    @Override
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        elemenets[actualSize++] = e;
        if (actualSize == elemenets.length) { // je�li koniec miejsca - powi�ksz zbi�r
            grow();
        }
        return true;
    }
    // dodaj 2x tyle miejsca od aktualnego size 10->20->40->80->160
    // kiedy chcemy zrobic grow ? Wtedy kiedy wiemy ze nie b�dziemy miec miejsca
    // np. dodali�my element na pozycj� 9, czyli actual size ju� zwiekszyl nam si� na pozycj� 10
    // actual size wynosi tyle ile nasz limit

    private void grow() {
        elemenets = Arrays.copyOf(elemenets, elemenets.length * 2);
    }
        /* Spos�b 1. p�tla for
        E[] newArray = (E[]) new Object[elemenets.length * 2];
        for (int i = 0; i < elemenets.length; i++) { // ilo�� element�w zale�y od starej listy, bo tyle chcemy przerzuci�
            newArray[i] = elemenets[i];

        }
        elements = newArray;


         */ // Spos�b 2. Kopiowanie


    /*
    @Override
    public boolean add(E e) {
        if (e == null) { // na razie nie akceptujemy nulli
            return false;
        }
        for (int i = 0; i < elemenets.length; i++) { // przegl�dam wszystkie elementy w tablicy
            if (elemenets[i] == null) { // je�li znajd� null, oznacza wolne miejsce
                elemenets[i] = e; // wstawiam moj� warto��
                break; // koniec
            }
        }
        actualSize++;
        return true; // return true - zak�adamy ze add si� powiedzie
    }


     */
    @Override
    public int size() {
        return actualSize;
    }
    /*
        for (int i = 0; i < elemenets.length; i++) { // iteruje po wartosciach w tablicy
            if (elemenets[i] == null) { // gdy jestem przy ostatnim elemencie wiec i = size
                return i; // je�li tak, zwr�c i (rozmiar tablicy)
            }
        }
        return 0;
    }

     */


    @Override
    public void add(int index, E element) { // musimy zrobi� miejsce na wszystkie elementy
        // 5,3,12,98 <- warto�ci =4 actualSize
        // 0,1,2,3, <- pozycja   | zaczynamy od konca, musimy miec dostep do ost. elementu
        // * dzia�anie p�tli
        // 5,3,12,98,98
        // * dzialanie p�tli
        // 5,3, 12, 12,98  dzia�anie p�tli
        // 5, 3, 3 , 12, 98
        //5, 723 , 12 , 98   <-- dodajemy 723 liczbe jak to zrobic

        for (int i = actualSize - 1; i >= index; i--) { // znajdujemy osatni przesuwamy go dalej az bedzie miejsce
            // jak zrobic miejsc na kolejna liczbe i ustawienie tej liczby
            // robienie miejsca -> znajdujemy miejsce gdzie jest ostatni element (actualSize -1)
            // na o 1 wieksza miejsce kopiuje go
            elemenets[i + 1] = elemenets[i];

        }
        elemenets[index] = element;

        actualSize++;
        if (actualSize == elemenets.length)
            grow();
    }

    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E elemenet : elemenets) {
            if (elemenet == null) {
                break;
            }
            //  if (elemenet == o){  ten zapis nie by�by z�y ale dokumentacja wskazuje ze musi by� equals
            if (elemenet.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }


    @Override
    public void clear() {


    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= actualSize) {
            // je�li index mniejszy od 0 albo wi�kszy od aktualnej to wychodzimy poza zakres
            // brane s� pod uwage realne, warto�ci w ArrayList, a nie wirtualne na zapas
            throw new IndexOutOfBoundsException();
            // robimy w�asn� zasad� wyj�tku
        }
        return elemenets[index];
    }

    @Override
    public E set(int index, E element) {
        return null;
    }


    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    } // chcemy aby Array list traktowano jak list�

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

}
