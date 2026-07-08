package module4.middle4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Нет действительных корней");
        } else {
            System.out.println("Есть действительные корни");
        }
    }
}
