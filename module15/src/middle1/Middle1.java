package middle1;

import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecursionExample example = new RecursionExample(n);
        example.printNumber(0, n);
    }
}
