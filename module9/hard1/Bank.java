package module9.hard1;


import java.util.ArrayList;


public class Bank {
    private double totalBalance;
    private ArrayList<BankAccount> bankAccounts;


    public Bank() {
        totalBalance = 1000;
        bankAccounts = new ArrayList<>();
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void createAccount(String accountNumber, double initBalance) {
        double tempBalance = getCurrentBalance();
        if (tempBalance + initBalance <= totalBalance) {
            bankAccounts.add(new BankAccount(accountNumber, initBalance));
            System.out.println("Аккаунт " + accountNumber + " был создан. " + "Баланс аккаунта: " + initBalance + " руб.");
        } else {
            System.out.println("Аккаунт " + accountNumber + " не был создан. " + "Недостаточно средств для создания аккаунта");
        }
    }

    private double getCurrentBalance() {
        double balance = 0;
        for (BankAccount bankAccount : bankAccounts) {
            balance += bankAccount.getBalance();
        }
        return balance;
    }

    public BankAccount findAccount(String accountNumbet) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumbet)) {
                return bankAccount;
            }
        }
        return null;
    }

    public void transferMoney(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount from = findAccount(fromAccountNumber);
        BankAccount to = findAccount(toAccountNumber);
        if (from == null || to == null) {
            System.out.println("Один из аккаунтов не найден");
            return;
        }
        if (from.getBalance() < amount) {
            System.out.println("Недостаточно средств для перевода");
            return;
        }
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Перевод выполнен из " + from.getAccountNumber() + " в " + to.getAccountNumber() + " на сумму " + amount);

    }

    public void showAccountsMoney(String accountNumber) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                System.out.println("Баланс аккаунта " + bankAccount.getAccountNumber() + " равен " + bankAccount.getBalance() + " руб");
            }
        }
    }

    public void closePartOfAccount(String accountNumber, double amount) {
        BankAccount acc = findAccount(accountNumber);
        if (acc == null) {
            System.out.println("Счёт не найден");
            return;
        }
        if (!acc.withdraw(amount)) {
            System.out.println("Недостаточно средств для вывода");
            return;
        }
        System.out.println("Со счёта " + accountNumber + " снято " + amount + " руб.");
    }

    public void freeMoney() {
        double freeMoney = 0;
        for (BankAccount bankAccount : bankAccounts) {
            freeMoney += bankAccount.getBalance();
        }
        System.out.println("Баланс всех счетов равен " +  freeMoney);
    }


}
