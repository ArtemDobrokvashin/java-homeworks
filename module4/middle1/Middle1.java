package module4.middle1;
import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(Math.max(Math.max(x, y), z));
        System.out.println(Math.min(Math.min(x, y), z));
        System.out.println(((x + y + z) - (Math.max(Math.max(x, y), z)) - (Math.min(Math.min(x, y), z))));
    }
}
