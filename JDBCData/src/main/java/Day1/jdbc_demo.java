package Day1;

import com.mysql.cj.result.Row;

import java.sql.*;
import java.util.Properties;

public class jdbc_demo {
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

             /* 1. UPDATE -> dodawanie nowych uzytkownikow
             int rowsChanged = stm.executeUpdate("INSERT INTO user9 (id,name,password,language) VALUES (1,'mikolaj','admin12345','DE')");
             rowsChanged = stm.executeUpdate("INSERT INTO user9 (id,name,password,language) VALUES (2,'nikola','trudnehaslo','PL')");
             rowsChanged = stm.executeUpdate("INSERT INTO user9 (name,password,language) VALUES ('waldemar','nicTrudnego','EN')");
             rowsChanged = stm.executeUpdate("INSERT INTO user9 (name,password,language) VALUES ('mariusz','testujemyHaslo','FR')");
             System.out.println("Rows changed: " + rowsChanged);
            /*

              */
            /* 2. SELECT -> wyświetlanie za pomocą ResultSet
            ResultSet rst = stm.executeQuery("SELECT * FROM user9 WHERE  language = 'pl';");
            while (rst.next()) {
                System.out.println(rst.getString("name"));
            }
             */

            /* 3. UPDATE

             */
            int RowsUpdate = stm.executeUpdate("UPDATE user9 SET name = 'marzena',  language = 'PL' WHERE ID = 1");
            System.out.println(RowsUpdate);


            /* 4. DELETE

            int RowsDelete = stm.executeUpdate("DELETE FROM user9 WHERE language = 'PL';");
            System.out.println(RowsDelete);
            */

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


