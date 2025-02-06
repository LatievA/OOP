package Assignment_4;

public class ATMSystem {
    public static void main(String[] args) {
        // Create Bank
        Bank bank = new Bank("Global Bank");

        // Create Accounts
        Account account1 = new Account("123456789", "1111", 500.0, bank);
        Account account2 = new Account("987654321", "2222", 1000.0, bank);

        // Create ATMs
        ATM atm1 = new ATM("ATM001", "123 Main St", bank);
        ATM atm2 = new ATM("ATM002", "456 Elm St", bank);
        ATM atm3 = new ATM("ATM003", "789 Oak St", bank);

        // Display account balance before withdrawal
        System.out.println("Initial balance: " + account1.getBalance());

        // Withdraw money from an account via ATM
        atm1.withdrawMoney("1111", 200.0);

        // Display account balance after withdrawal
        System.out.println("Balance after withdrawal: " + account1.getBalance());
    }
}
