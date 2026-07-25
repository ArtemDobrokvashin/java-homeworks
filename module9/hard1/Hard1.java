package module9.hard1;

public class Hard1 {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("b1", 100);
        bank.createAccount("b2", 200);
        bank.createAccount("b3", 300);
        bank.createAccount("b4", 400);
        bank.createAccount("b5", 500);
        bank.createAccount("b6", 600);
        System.out.println(bank.getTotalBalance());

        bank.transferMoney("b1", "b2", 200);
        bank.transferMoney("b1", "b3", 50);
        bank.showAccountsMoney("b1");
        bank.showAccountsMoney("b2");
        bank.closePartOfAccount("b2", 100);
        bank.showAccountsMoney("b2");
        bank.freeMoney();
        System.out.println(bank.getTotalBalance());
        bank.createAccount("b10", 100);
        bank.freeMoney();

    }
}
