package middle2;

import java.util.Scanner;

public class middle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (((a + b) > c) &&((a + c) > b) && ((b + c) > a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
