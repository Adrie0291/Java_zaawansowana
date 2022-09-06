package Day2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//KLASA REPOSITORY - MAMY TUTAJ NASZE 4 METODY CRUD

public class UserRepository {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcprojekt2";
    private Connection conn = null; // tutaj robimy inicjalizację, aby mieć do niej dostęp z każdej z metod
    private static final String SAVE_USER_SQL = "INSERT INTO user40 (name, password, language) VALUES (?, ? ,?);";
    private static final String DELETE_USER_SQL = "DELETE FROM user40 WHERE id = ?;";
    private static final String UPDATE_USER_SQL = "UPDATE user40 SET name = ?, password = ?, language = ? WHERE id = ?;";
    private static final String FIND_USER_BY_LANGUAGE_SQL = "SELECT * FROM user40 WHERE language = ?;";

    public UserRepository() {
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "admin");
        properties.put("serverTimezone", "CET");
        properties.setProperty("useSSL", "false");

        try {
            conn = DriverManager.getConnection(DB_URL, properties);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void saveUser(User user) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(SAVE_USER_SQL);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getLanguage().name());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(int id) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(DELETE_USER_SQL);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            PreparedStatement pstmt = conn.prepareStatement(UPDATE_USER_SQL);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getLanguage().name());
            pstmt.setInt(4, user.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public List<User> findUsersByLanguage(Language language) {
        List<User> users = new ArrayList<>();
        try {
            PreparedStatement pstmt = conn.prepareStatement(FIND_USER_BY_LANGUAGE_SQL);
            pstmt.setString(1, language.name());
            ResultSet rst = pstmt.executeQuery();
            while (rst.next()) {
                users.add(new User(
                        rst.getInt("id"),
                        rst.getString("name"),
                        rst.getString("password"),
                       // rst.getString("language")
                        Language.valueOf(rst.getString("language"))
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
