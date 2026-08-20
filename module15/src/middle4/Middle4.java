package middle4;

import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какое число проверяем❓");
        int n = sc.nextInt();

        System.out.println(isExactPowerOf2(n) ? "Yes" : "No");
    }

    public static Boolean isExactPowerOf2(int n) {
        if (n == 0) return false;
        return (n & (n - 1)) == 0;
    }
}
