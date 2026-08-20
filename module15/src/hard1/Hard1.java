package hard1;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер рюкзака: ");
        int volumeOfBackPack = sc.nextInt();

        System.out.println("Введите кол-во предметов всего: ");
        int totalItems = sc.nextInt();


        int[] weigh = new int[totalItems];
        int[] cost = new int[totalItems];

        for (int i = 0; i < totalItems; i++) {
            System.out.println("Введите вес " + (i + 1) + " предмета: ");
            weigh[i] = sc.nextInt();
            System.out.println("Введите стоимость " + (i + 1) + " предмета: ");
            cost[i] = sc.nextInt();
        }

        System.out.println("Максимальная стоимость предметов рюкзаке: " + backpack(weigh, cost, volumeOfBackPack));
    }

    public static int backpack(int[] weigh, int[] cost, int volumeOfBackPack) {
        int n = weigh.length;
        if (n == 0 || volumeOfBackPack == 0) {
            return 0;
        }

        int[][] array = new int[n + 1][volumeOfBackPack + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= volumeOfBackPack; w++) {
                int currentWeight = weigh[i - 1];
                int currentValue = cost[i - 1];

                if (currentWeight <= w) {
                    array[i][w] = Math.max(
                            array[i - 1][w],
                            currentValue + array[i - 1][w - currentWeight]
                    );
                } else {
                    array[i][w] = array[i - 1][w];
                }
            }
        }

        return array[n][volumeOfBackPack];
    }
}
