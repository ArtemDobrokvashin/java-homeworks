import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Middle2 {

    public static void main(String[] args) {
        System.out.println("Введите список чисел");
        int total = 0;
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String[] numbersArr = numbers.split("[\\s\\p{Punct}]+");
        Set<String> set = new HashSet<>();
        for (String s : numbersArr) {
            set.add(s);
        }
        System.out.println(set.size());
    }
}
