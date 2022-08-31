import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.PropertyResourceBundle;

public class hello {
    public static void main(String[] args) {
        System.out.println("hello");
        final String DB_URL = "jdbc:mysql://localhost:3306/hibernacja";
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "root");
        connectionProps.put("serverTimezone", "CET");

      