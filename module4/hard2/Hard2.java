package module4.hard2;

import java.util.Scanner;
import java.lang.Math;

public class Hard2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        if (x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8 &&
                x2 >= 1 && x2 <= 8 && y2 >= 1 && y2 <= 8) {

            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("Координаты вне шахматной доски");
        }
    }
}
