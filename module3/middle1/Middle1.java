package middle1;
import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        int day = scanner.nextInt();
        System.out.println("Зарплата за отработанные дни: " + (double) (salary * day));
    }
}
