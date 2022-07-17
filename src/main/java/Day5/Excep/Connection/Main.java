package Day5.Excep.Connection;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connect();
            System.out.println(fileConnection.getBooksFromFile());
        } catch (FileConnectionException e) {
            System.out.println("B³¹d przy po³¹czeniu ");
        } catch (FileDbConnectionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(fileConnection);
        }
    }
}
