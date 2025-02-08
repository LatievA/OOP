package Assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ATMSystem extends JFrame {
    private JTextField accountNumberField, pinField, amountField;
    private JButton withdrawButton, checkBalanceButton, addMoneyButton, addAccountButton, deleteAccountButton;
    private JTextArea outputArea;
    private Bank bank;

    public ATMSystem(Bank bank) {
        this.bank = bank;
        setTitle("ATM System");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Account Number:"));
        accountNumberField = new JTextField(10);
        add(accountNumberField);

        add(new JLabel("Enter PIN:"));
        pinField = new JTextField(10);
        add(pinField);

        add(new JLabel("Amount:"));
        amountField = new JTextField(10);
        add(amountField);

        withdrawButton = new JButton("Withdraw");
        checkBalanceButton = new JButton("Check Balance");
        addMoneyButton = new JButton("Add Money");
        addAccountButton = new JButton("Add Account");
        deleteAccountButton = new JButton("Delete Account");

        add(withdrawButton);
        add(checkBalanceButton);
        add(addMoneyButton);
        add(addAccountButton);
        add(deleteAccountButton);

        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        withdrawButton.addActionListener(e -> withdrawMoney());
        checkBalanceButton.addActionListener(e -> checkBalance());
        addMoneyButton.addActionListener(e -> addMoney());
        addAccountButton.addActionListener(e -> addAccount());
        deleteAccountButton.addActionListener(e -> deleteAccount());

        setVisible(true);
    }

    private void withdrawMoney() {
        String accountNumber = accountNumberField.getText();
        String pin = pinField.getText();
        double amount = Double.parseDouble(amountField.getText());

        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber) && account.getPinCode().equals(pin)) {
                if (account.withdrawFromAccount(amount)) {
                    outputArea.setText("Withdrawal successful! New balance: " + account.getBalance());
                } else {
                    outputArea.setText("Insufficient funds.");
                }
                return;
            }
        }
        outputArea.setText("Invalid account number or PIN.");
    }

    private void checkBalance() {
        String accountNumber = accountNumberField.getText();
        String pin = pinField.getText();

        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber) && account.getPinCode().equals(pin)) {
                outputArea.setText("Current balance: " + account.getBalance());
                return;
            }
        }
        outputArea.setText("Invalid account number or PIN.");
    }

    private void addMoney() {
        String accountNumber = accountNumberField.getText();
        double amount = Double.parseDouble(amountField.getText());

        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.addMoney(amount);
                outputArea.setText("Money added successfully! New balance: " + account.getBalance());
                return;
            }
        }
        outputArea.setText("Account not found.");
    }

    private void addAccount() {
        String accountNumber = accountNumberField.getText();
        String pin = pinField.getText();
        double balance = Double.parseDouble(amountField.getText());

        Account newAccount = new Account(accountNumber, pin, balance, bank);
        newAccount.saveToDatabase();
        outputArea.setText("New account added.");
    }

    private void deleteAccount() {
        String accountNumber = accountNumberField.getText();

        for (Account account : bank.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                bank.getAccounts().remove(account);
                account.deleteFromDatabase();
                outputArea.setText("Account deleted successfully.");
                return;
            }
        }
        outputArea.setText("Account not found.");
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        new ATMSystem(bank);
    }
}
