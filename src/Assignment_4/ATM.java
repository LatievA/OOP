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

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Bank getBank() {
        return bank;
    }

    public void withdrawMoney(String pinCode, double amount) {
        for (Account account : bank.getAccounts()) {
            if (account.getPinCode().equals(pinCode)) {
                account.withdrawFromAccount(amount);
                return;
            }
        }
        System.out.println("Invalid PIN. Transaction failed.");
    }
}
