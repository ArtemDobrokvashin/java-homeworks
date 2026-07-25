public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
}
