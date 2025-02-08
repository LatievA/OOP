package Assignment_4;

public class ATM {
    private String id;
    private String address;
    private Bank bank;

    public ATM(String id, String address, Bank bank) {
        this.id = id;
        this.address = address;
        this.bank = bank;
        bank.addATM(this);
    }

    public void withdrawMoney(String pinCode, double amount) {
        for (Account account : bank.getAccounts()) {
            if (account.getPinCode().equals(pinCode)) {
                if (account.withdrawFromAccount(amount)) {
                    System.out.println("Withdrawal successful! New balance: " + account.getBalance());
                } else {
                    System.out.println("Insufficient funds.");
                }
                return;
            }
        }
        System.out.println("Invalid PIN.");
    }
}
