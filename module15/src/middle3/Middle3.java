package middle3;

import java.util.Scanner;

public class Middle3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int f0 = 1;
        int f1 = 1;
        int f2 = 2;
        int s = 4;

        while (f2 <= m) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            s = s + f2;
        }

        s = s + f2;
        s = s - f2;

        System.out.println(s);
    }
}

