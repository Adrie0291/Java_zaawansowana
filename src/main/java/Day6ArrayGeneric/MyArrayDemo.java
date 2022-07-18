package Day6ArrayGeneric;

import java.util.List;

public class MyArrayDemo {
    public static void main(String[] args) {

        MyContainer<Integer> intContainer = new MyContainer<>();
        intContainer.setData(10);
        System.out.println(intContainer.getData());

        MyContainer<String> stringContainer = new MyContainer<>();
        stringContainer.setData("ziemia");
        System.out.println(stringContainer.getData());

     //   List<Integer> myList = new MyArrayList<>(); to siê podkreœla na czerwono, musimy zaimplementowaæ interfejs listy


    }
}
