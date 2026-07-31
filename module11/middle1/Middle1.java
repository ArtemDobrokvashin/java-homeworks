import java.util.*;

public class Middle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine().toLowerCase();

        Map<String, Integer> map = new HashMap<>();

        for (String s : str.split("[\\s\\p{Punct}]+")) {
            map.merge(s, 1, Integer::sum);
        }

        map.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " [" + entry.getValue() + "]"));


    }
}
