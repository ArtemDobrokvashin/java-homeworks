package easy5;

import java.util.Scanner;

public class Easy5 {
    public static void main(String[] args) {
        System.out.println("Введите число и степень");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int res = 1;
        for (int i = 0; i < n; i++){
            res *= a;
        }
        System.out.println(res);
    }
}
