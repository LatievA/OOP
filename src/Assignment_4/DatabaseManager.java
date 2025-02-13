package Assignment_4;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3006/atm_db";
    //atm_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
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

    public static void loadAccounts(Bank bank) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT account_number, pin, balance FROM accounts");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String accountNumber = rs.getString("account_number");
                String pin = rs.getString("pin");
                double balance = rs.getDouble("balance");
                new Account(accountNumber, pin, balance, bank);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void saveAccountChanges(String accountNumber, double balance) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE account_number = ?")) {
            stmt.setDouble(1, balance);
            stmt.setString(2, accountNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void executeCommand(String command, String successMessage, String failureMessage) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            int processComplete = process.waitFor();

            if (processComplete == 0) {
                System.out.println(successMessage);
            } else {
                System.out.println(failureMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
