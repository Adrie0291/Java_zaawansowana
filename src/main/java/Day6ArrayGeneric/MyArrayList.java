package Day6ArrayGeneric;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
    /*zeby traktowac j¹ jak my list, musi implementowaæ list od E
     jak mamy interfejs musimy zdefiniowaæ wszystkie abstrakcyjne metody
         myArrayList ma pod spodem zwyk³¹ tablicê,  ta tablica bêdzie typu E.
     */
    private E[] elements = (E[]) new Object[10]; // generyczna lista elementów
    private int actualSize = 0; // dodanie tego powoduje zmiany metody size

    // niestety w instrukcji wywo³uj¹cej konstruktor i w instrukcji po new przy tworzeniu
    // obiektu nie moze wykorzystac generycznego typu, jedyny typ, to Object
    // stad jest potrzeba rzutowania go na typ E, zeby mozna bylo dalej korzystac generycznie
    // tak niestety to musi byc


    @Override
    public boolean add(E e) {
        if (e == null) {
            return false;

        }
        elements[actualSize++] = e;

      //   actualSize++;
        return true;
    }

    /*
    @Override
    public boolean add(E e) {
        if (e == null) { // na razi nie akceptujemy nulli
            return false;
        }


        for (int i = 0; i < elements.length; i++) { // przegladam wszystkie
            if (elements[i] == null) { // z nullem oznacza wolne miejsce
                elements[i] = e; //jeœli znajdzie, wstawiam
                break; // koniec przebiegu
            }
        }
        actualSize++; // co daje actuals Size ?
        return true;          // return true - jesli sie powiedzie
    }


     */
    // aktualnie mamy tablice 10 pozycji null
    // for each niemozemy iterowaæ bo nie bedziemym mogli zmienic wartosci w indeksu
    // musi byc zwykla petla for z indeksem
    @Override
    public void add(int index, E element) {

    }

    @Override
    public int size() {
        return actualSize;
    }
/*
    @Override
    public int size() {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) { // jestem przy ostatnim elemencie wiec i = size
                return i;
            }
        }
        return 0;
    }


 */


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
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
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
    }

}
