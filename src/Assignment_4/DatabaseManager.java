package Assignment_4;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3006/atm_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    //private static final String URL = "jdbc:mysql://localhost:33060/atm_db";
    private static final String USER = "root";
    private static final String PASSWORD = "wdsaL@722006";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Load MySQL Driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
