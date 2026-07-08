package modele4.middle3;

import java.util.Scanner;

public class Middle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingredients = sc.nextLine();
        String[] ingredient = ingredients.toLowerCase().split(" ");
        boolean milk = false;
        boolean eggs = false;
        boolean coffee = false;

        for (String item : ingredient) {
            if (item.equals("молоко")) {
                milk = true;
            }
            if (item.equals("кофе")) {
                coffee = true;
            }
            if (item.equals("яйца")) {
                eggs = true;
            }
        }
        if (coffee && milk) {
            System.out.println("Можно приготовить кофе");
        }
        if (eggs && milk) {
            System.out.println("Можно приготовить омлет");
        }
        if (eggs) {
            System.out.println("Можно приготовить яичницу");
        }

    }
}
