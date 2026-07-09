package module5.middle4;
import java.util.Scanner;

public class Middle4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = -1;

        while (userNum < 1){
            System.out.println("ведите натуральное число от 1");
            userNum = sc.nextInt();
            if (userNum < 1){
                System.out.println("Неправильный ввод. Повторите попытку");
            }
        }
        int res = 1;
        for (int i = 1; i <= userNum; i++){
            res *= i;
        }

        System.out.println(res);

    }
}
