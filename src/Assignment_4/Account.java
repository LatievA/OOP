package Assignment_4;

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

    public void replenishAccount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Account replenished. New balance: " + balance);
        }
    }

    public boolean withdrawFromAccount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful. Remaining balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }
}
