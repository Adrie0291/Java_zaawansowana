package Day1;

import java.sql.*;
import java.util.Properties;

public class prepareStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbcprojekt"; // adres URL 3306 standardowy HOST, hibernate - nasza nazwa bazy danych
        Properties properties = new Properties(); // obiekt Properties zawiera parę klucz - wartość, istnieje też plik properties
        properties.put("user", "root"); // login użytkownika, którym logujemy się do bazy
        properties.put("password", "admin"); // haslo uzytkowniak
        properties.put("serverTimezone", "CET"); // opcjonalne strefa czasowa
        properties.setProperty("useSSL", "false"); // opcjonalne, likwidue ostrzeżenie które leci


        //tworzenie połączenia
        Connection conn = null;
        Statement stm = null;
        try {
            conn = DriverManager.getConnection(url, properties); // z tego zapytania conn będziemy tworzyć konkretne zapytania do bazy
            stm = conn.createStatement(); // na razie pusty obiekt

            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user9 WHERE id = ?");
            pstmt.setInt(1, 1);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("User name for ID 1: " + rs.getString("name") + " User ID: " + rs.getInt("id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close(); // można umieścić w bloku try, ale lepiej wstawić po przejściu wszystkiego
                if (stm != null)
                    stm.close(); //
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


