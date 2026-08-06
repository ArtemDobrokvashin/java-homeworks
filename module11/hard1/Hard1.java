import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hard1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> firtSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();

        System.out.println("Введите первое множество, каждое число на отдельной строке.\nПо завершению просто нажмите Enter");
        while (true) {
            System.out.print("Число: ");
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                int num = Integer.parseInt(s);
                firtSet.add(num);
            } else {
                break;
            }
        }
        System.out.println("Первое множество: " + firtSet);

        System.out.println("Введите второе множество, каждое число на отдельной строке.\nПо завершению просто нажмите Enter");
        while (true) {
            System.out.print("Число: ");
            String s = sc.nextLine();
            if (!s.isEmpty()) {
                int num = Integer.parseInt(s);
                secondSet.add(num);
            } else {
                break;
            }
        }
        System.out.println("Второе множество: " + secondSet);
        HashSet<Integer> middleSet = new HashSet<>(firtSet);
        middleSet.removeAll(secondSet);


        secondSet.removeAll(firtSet);
        middleSet.addAll(secondSet);

        System.out.println("Результат" + middleSet);

    }
}
