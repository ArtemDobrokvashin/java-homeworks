package module4.easy5;

import java.util.Scanner;

public class Easy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y;

        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }

        System.out.println(y);
    }
}
