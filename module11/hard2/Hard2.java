import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {


        System.out.println("Введите [ [ { ] } ] для проверки последовательности");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.isEmpty()) {
            System.out.println("Ничего не введено");
            return;
        }
        if (!s.matches("^[()\\[\\]{}]+$")) {
            System.out.println("Введен недопустимый символ");
            return;
        }

        Deque<String> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                deque.push(String.valueOf(c));
            } else {
                if (deque.isEmpty()) {
                    System.out.println("неправильно");
                    return;
                }
                String top = deque.pop();
                if ((c == ')' && !top.equals("(")) ||
                        (c == ']' && !top.equals("[")) ||
                        (c == '}' && !top.equals("{"))) {
                    System.out.println("неправильно");
                    return;
                }
            }
        }

        if (deque.isEmpty()) {
            System.out.println("правильно");
        } else {
            System.out.println("неправильно");
        }
    }
}