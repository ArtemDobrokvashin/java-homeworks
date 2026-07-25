package module9.middle1;

public class Middle1 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount first = new BankAccount(1000000);
        BankAccount second = new BankAccount(530570);

        bank.addAccount(first);
        bank.addAccount(second);


        System.out.println("Счёт 1: " + first.getBalance());
        System.out.println("Счёт 2: " + second.getBalance());

        bank.transfer(0, 1, 110000);
        System.out.println("Счёт 1: " + first.getBalance());
        System.out.println("Счёт 2: " + second.getBalance());

        bank.transfer(0, 1, 1100000);
        System.out.println("Счёт 1: " + first.getBalance());
        System.out.println("Счёт 2: " + second.getBalance());


    }
}
