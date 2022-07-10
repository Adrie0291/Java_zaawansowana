package Day3.Enum;

public class Shirt {
    private Size size;  // zmieniamy typ klasy na klasê enumow¹ czyli Size

    public Shirt(Size size) {  // String -> Size
        this.size = size;

    }

    public Size getSize() {  // String -> Size
        return size;
    }
    public int getNumericSize(){
        return size.getNumericSize();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}

