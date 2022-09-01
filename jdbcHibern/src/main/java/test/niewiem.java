package test;

import java.sql.*;
import java.util.Properties;

public class niewiem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hibernacja"; // gdzie się łączymy
        Properties properties = new Properties();
        // jak się łączymy
        properties.put("user", "root");
        properties.put("password", "admin");
        properties.setProperty("serverTimezone", "CET");
        properties.setProperty("use SSL", "false");

        Connection connection = null; // inicjalziacja zmiennej connection żebysmy mogli jej w bloku finally używać w razie potrzby
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, properties); // z tego połączenia tworzym konkretne zapytania do bazy
            statement = connection.createStatement(); // pusty obiekt zapytnaia
//            int rowsChanges = statement.executeUpdate("INSERT INTO user2 (name, password, language) VALUES ('adrianbe','haslo200','pl') ");
//            System.out.println("Rows changed: " + rowsChanges);


            //  ResultSet resultSet = statement.executeQuery("SELECT * FROM user2 WHERE language = 'pl';");
            // while(resultSet.next()){
            //    System.out.println(resultSet.getString("name"));
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM user2 WHERE language = ?");
            pstmt.setString(1, "pl");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("program.User form PL: " + rs.getString("name") + " program.User id: " + rs.getInt("id"));
            }

        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close(); // na connection.close również musimy obsłużyć wyjątek
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}