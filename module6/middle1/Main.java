package middle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите действие: +, -, *, / (символьно)");
        String operator = sc.nextLine();

        System.out.println("Введите значение для a:");
        int a = sc.nextInt();

        System.out.println("Введите значение для b:");
        int b = sc.nextInt();

        Calculator calculator = new Calculator();

        if (operator.equals("+")) {
            System.out.println(calculator.add(a, b));
        } else if (operator.equals("-")) {
            System.out.println(calculator.subtract(a, b));
        } else if (operator.equals("*")) {
            System.out.println(calculator.multiply(a, b));
        } else if (operator.equals("/")) {
            System.out.println(calculator.divide(a, b));
        } else {
            System.out.println("Ошибка ввода. Введите +, -, * или /");
        }


    }
}
