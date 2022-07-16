package Day5.Excep.Wywolanie;

public class Book {
    private String title;
    private int printData;

    public Book(String title, int printData) {
        this.title = title;
        this.printData = printData;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", printData=" + printData +
                '}';
    }
}
