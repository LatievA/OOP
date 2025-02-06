package Assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ATMSystem extends JFrame {
    private JTextField pinField, amountField;
    private JButton withdrawButton, checkBalanceButton;
    private JTextArea outputArea;
    private Bank bank;

    public ATMSystem(Bank bank) {
        this.bank = bank;
        setTitle("ATM System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel pinLabel = new JLabel("Enter PIN:");
        pinField = new JTextField(10);
        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);
        withdrawButton = new JButton("Withdraw");
        checkBalanceButton = new JButton("Check Balance");
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);

        add(pinLabel);
        add(pinField);
        add(amountLabel);
        add(amountField);
        add(withdrawButton);
        add(checkBalanceButton);
        add(new JScrollPane(outputArea));

        withdrawButton.addActionListener(e -> withdrawMoney());
        checkBalanceButton.addActionListener(e -> checkBalance());

        setVisible(true);
    }

    private void withdrawMoney() {
        String pin = pinField.getText();
        double amount = Double.parseDouble(amountField.getText());
        for (Account account : bank.getAccounts()) {
            if (account.getPinCode().equals(pin)) {
                if (account.withdrawFromAccount(amount)) {
                    outputArea.setText("Withdrawal successful! New balance: " + account.getBalance());
                } else {
                    outputArea.setText("Insufficient funds.");
                }
                return;
            }
        }
        outputArea.setText("Invalid PIN.");
    }

    private void checkBalance() {
        String pin = pinField.getText();
        for (Account account : bank.getAccounts()) {
            if (account.getPinCode().equals(pin)) {
                outputArea.setText("Current balance: " + account.getBalance());
                return;
            }
        }
        outputArea.setText("Invalid PIN.");
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        new Account("123456789", "1111", 500.0, bank);
        new Account("987654321", "2222", 1000.0, bank);
        new ATM("ATM001", "123 Main St", bank);
        new ATMSystem(bank);
    }
}
