package Day6ArrayGeneric;

public class MyContainer<E> { // przechowuje jeden element, ale dynamicznie wybierany typ
    // w tym momencie mo¿emy tworzyæ zmienn¹ o typu E, metody, które zwracaj¹ E, pisaæ metody które przyjmuj¹ typ E
    private E data;

    public void setData(E e) {
        data = e;
    }

    public E getData() {
        return data;
    }
}
