package module9.hard1;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;


    }
}
