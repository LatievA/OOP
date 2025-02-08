package Assignment_4;

import java.sql.*;

public class Account {
    private String accountNumber;
    private String pinCode;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, String pinCode, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.bank = bank;
        bank.addAccount(this);
        saveToDatabase();
    }

    public void saveToDatabase() {
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement("SELECT COUNT(*) FROM accounts WHERE account_number = ?")) {

            checkStmt.setString(1, accountNumber);
            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Account already exists in the database. Skipping insertion.");
                return;
            }

            try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO accounts (account_number, pin, balance) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, accountNumber);
                stmt.setString(2, pinCode);
                stmt.setDouble(3, balance);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFromDatabase() {
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM accounts WHERE account_number = ?")) {
            stmt.setString(1, accountNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            updateDatabase();
        }
    }

    public boolean withdrawFromAccount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            updateDatabase();
            return true;
        }
        return false;
    }

    private void updateDatabase() {
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE accounts SET balance = ? WHERE account_number = ?")) {
            stmt.setDouble(1, balance);
            stmt.setString(2, accountNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
