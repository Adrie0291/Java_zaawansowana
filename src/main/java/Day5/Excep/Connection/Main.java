package Day5.Excep.Connection;


public class Main {
    public static void main(String[] args) {
        FileConnection fileConnection = new FileConnection();
        try {
            fileConnection.connect();
        } catch (FileConnectionException e) {
            System.out.println("B��d przy po��czeniu ");
        }
        System.out.println(fileConnection);
    }
}
