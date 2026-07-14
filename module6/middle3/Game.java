package module6.middle3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private  int sticks;
    private final String name;


    public Game(String name){
        this.sticks = 20;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start(){
        System.out.println("Старт игры! Палочек " + sticks);

        while (sticks > 1){
            displaySticks();
            System.out.println("Сколько палочек хотите взять?");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            if (choose <1 || choose > 3 || choose > sticks){
                System.out.println("Неправильный ввод. Можно взять от 1 до 3 палочек.");
            } else {
                sticks -= choose;
                if (sticks == 1){
                    System.out.println("You win");
                    return;
                }
            }
            Random random = new Random();
            int maxMovie = Math.min(3, sticks - 1);
            int compMove = random.nextInt(maxMovie) + 1;
            System.out.println("Соперник убрал " + compMove + " палочек");
            sticks -= compMove;

            if (sticks == 1) {
                System.out.println("Компьютер победил! Вам осталась последняя палочка.");
                return;
            }
        }
    }


    public void displaySticks(){
        for (int i = 0; i < sticks; i++) {
            System.out.print("|");
        }
        System.out.println();
    }






}
