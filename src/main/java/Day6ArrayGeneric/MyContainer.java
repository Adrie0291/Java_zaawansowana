package Day6ArrayGeneric;

public class MyContainer<E> { // przechowuje jeden element, ale dynamicznie wybierany typ
    // w tym momencie mo�emy tworzy� zmienn� o typu E, metody, kt�re zwracaj� E, pisa� metody kt�re przyjmuj� typ E
    private E data;

    public void setData(E e) {
        data = e;
    }

    public E getData() {
        return data;
    }
}
