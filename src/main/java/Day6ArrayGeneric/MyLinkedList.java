package Day6ArrayGeneric;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private MyNode<E> firstNode = null;
    private int actualSize = 0;

    @Override
    public boolean add(E e) {
        MyNode<E> newNode = new MyNode<>(e); // tworze wagonik, ktory bedzie przechowywal nowy elemeent
        actualSize++;
        if (firstNode == null) {
            firstNode = newNode;
            return true; // skoñæzylismy prace - koniec metody
        }
        // aktualny node = first node
        MyNode<E> actualNode = firstNode;  // pewnoœæ tego ¿e mamy firstNode jest z metody wy¿ej
        while (actualNode.nextNode != null) { // ten zapis lepszy, bo petla moze sie w ogole niewykonac
            actualNode = actualNode.nextNode; // moze byc ze 1. node nie ma nastepnego node'a, wtedy
        }
        actualNode.nextNode = newNode;
        return true;
        // powtarzaj do momentu gdy, jak nastepny node naszego noda jest nulle,
        // to znaczy ze aktualny jest ostatnim wezlem, koncem listy i do niego chcemy podpiac nowy wezel
    }


    @Override
    public E get(int index) {
        if (index < 0 || index >= actualSize) { // czy zapytano o istniejacy index
            throw new IndexOutOfBoundsException();
        }
        MyNode<E> actualNode = firstNode;    // aktualny node
        for (int i = 1; i <= index; i++) { // przestawianie aktualnego az na ten o podanym indeksie
            actualNode = actualNode.nextNode;
        }

        return actualNode.data; // wyciagniecie danych

        /* 1. wersja
        switch (index) {
            case 0:
                return firstNode.data; // firstNode jest typem Node<E> a firstNode.data (jej wartoœæ) to typ E
            case 1:
                return firstNode.nextNode.data; // bierzemy firstNode, bierzemy kolejnego Node'a
    return null;

        } */

    }


    @Override
    public void add(int index, E element) {
        actualSize++;
        MyNode<E> newNode = new MyNode<>(element); // nowy node

        MyNode<E> actual = firstNode;  //reprezentuje node po nowym nodzie
        MyNode<E> beforeActual = null; //reprezentuje node przed nowym nodem
        for (int i = 1; i <= index; i++) { //znajduje odpowiednie nody
            beforeActual = actual;
            actual = actual.nextNode;
        }
        newNode.nextNode = actual; //nowy node wskazuje tego kto by³ na jego miejscu jako jego kolejny

        if (beforeActual == null) { // dalej nie ma poprzedniego a wiêc - zmieni³ siê pierwszy node!
            firstNode = newNode;
        }else{
            beforeActual.nextNode = newNode; // jeœli by³ poprzedni to ma wskazywaæ na ten nowy
        }
    }

    @Override
    public int size() {
        return actualSize;
    }


    @Override
    public E set(int index, E element) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

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
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
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

    class MyNode<E> {
        private E data;
        private MyNode<E> nextNode = null;
        // node sam w sobie moze trzymac inny Node, czyli
        // kolejny obiekt z tej samej z samej klasy w zmiennej i na niego wskazywac

        public MyNode(E data) {
            this.data = data;
        }
    }
}
