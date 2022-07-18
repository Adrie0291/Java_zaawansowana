package Day6ArrayGeneric;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elemenets = (E[]) new Object[10];// myArrayList ma pod spodem zwyk³¹ tablicê typu E
    private int actualSize = 0; // domyœlnie wynosi 0, nie musimy pisaæ,

    @Override
    public boolean add(E e) {
        if (e == null) {
            return false;
        }
        elemenets[actualSize++] = e;
        if (actualSize == elemenets.length) { // jeœli koniec miejsca - powiêksz zbiór
            grow();
        }
        return true;
    }
    // dodaj 2x tyle miejsca od aktualnego size 10->20->40->80->160
    // kiedy chcemy zrobic grow ? Wtedy kiedy wiemy ze nie bêdziemy miec miejsca
    // np. dodaliœmy element na pozycjê 9, czyli actual size ju¿ zwiekszyl nam siê na pozycjê 10
    // actual size wynosi tyle ile nasz limit

    private void grow() {
        elemenets = Arrays.copyOf(elemenets, elemenets.length * 2);
    }
        /* Sposób 1. pêtla for
        E[] newArray = (E[]) new Object[elemenets.length * 2];
        for (int i = 0; i < elemenets.length; i++) { // iloœæ elementów zale¿y od starej listy, bo tyle chcemy przerzuciæ
            newArray[i] = elemenets[i];

        }
        elements = newArray;


         */ // Sposób 2. Kopiowanie


    /*
    @Override
    public boolean add(E e) {
        if (e == null) { // na razie nie akceptujemy nulli
            return false;
        }
        for (int i = 0; i < elemenets.length; i++) { // przegl¹dam wszystkie elementy w tablicy
            if (elemenets[i] == null) { // jeœli znajdê null, oznacza wolne miejsce
                elemenets[i] = e; // wstawiam moj¹ wartoœæ
                break; // koniec
            }
        }
        actualSize++;
        return true; // return true - zak³adamy ze add siê powiedzie
    }


     */
    @Override
    public int size() {
        return actualSize;
    }
    /*
        for (int i = 0; i < elemenets.length; i++) { // iteruje po wartosciach w tablicy
            if (elemenets[i] == null) { // gdy jestem przy ostatnim elemencie wiec i = size
                return i; // jeœli tak, zwróc i (rozmiar tablicy)
            }
        }
        return 0;
    }

     */


    @Override
    public void add(int index, E element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
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
        return null;
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
    } // chcemy aby Array list traktowano jak listê

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
