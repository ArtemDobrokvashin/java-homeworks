package module9.middle1;
import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> bankAccounts;

    public Bank() {
        bankAccounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public void transfer(int fromIndex, int toIndex, double amount) {
        if (fromIndex < 0 || fromIndex >= bankAccounts.size() ||
                toIndex < 0 || toIndex >= bankAccounts.size() || fromIndex == toIndex) {
            System.out.println("Некорректные номера счетов");
            return;
        }


        BankAccount sender = bankAccounts.get(fromIndex);
        BankAccount receiver = bankAccounts.get(toIndex);

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            System.out.println("Перевод " + amount + "руб. выполнен");
        } else {
            System.out.println("Недостаточно средств");
        }

    }
}
