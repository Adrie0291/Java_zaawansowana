package Day3.EnumStare;

public class Shirt {
    private String size;

    public Shirt(String size) {
        this.size = size;

    }

    public String getSize() {
        return size;
    }



    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
