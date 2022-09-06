package Day1;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class sqlInjection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcprojekt";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "admin");
        properties.setProperty("serverTimezone", "CET");
        properties.setProperty("useSSL", "false");

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, properties);
            statement = connection.createStatement();
            System.out.println("Wpisz imie uzytkownika: ");
            String name = new Scanner(System.in).nextLine();

            ResultSet searchSql = statement.executeQuery("SELECT name, password, language FROM user9 WHERE name = '" + name + "'; ");

            while (searchSql.next()) {
                System.out.println(" password = " + searchSql.getString("password"));
                System.out.println(" name = " + searchSql.getString("name"));
                System.out.println(" language = " + searchSql.getString("language"));

            }

        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}