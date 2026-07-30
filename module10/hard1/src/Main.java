package hard1.src;

import characters.Goblin;
import core.Hero;
import items.Gun;
import items.Spear;
import items.Sword;
import items.Weapon;
import lore.FrontDescriptions;
import lore.LeftDescriptions;
import lore.RightDescriptions;
import rooms.BattleRoom;
import rooms.HealingRoom;
import rooms.Room;
import rooms.TrapRoom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Room> roomPool = Arrays.asList(
                new BattleRoom(),
                new HealingRoom(),
                new TrapRoom()
        );

        Weapon weapon = null;
        while (true) {
            System.out.println("Ну что могу предложить, господа? Меч, копьё и пистолет. Всё отстреляно. Все в полном боекомплекте.\n" +
                    "Дают осечки, примерно, 50 на 50. Эхо войны.\n" +
                    "\n " +
                    "[1] Меч. Обычный, стандартный. Урон 15.\n" +
                    "[2] Копье. Тяжелое, времен Цезаря. Ржавое, но надежное. Урон 25.\n" +
                    "[3] Пистолет. Тульский Токарев, он же ТТ, сегодня один, извини, очень быстро разбирают.");
            if (sc.hasNextInt()) {
                int chooseWeapon = sc.nextInt();
                switch (chooseWeapon) {
                    case 1:
                        weapon = new Sword();
                        break;
                    case 2:
                        weapon = new Spear();
                        break;
                    case 3:
                        weapon = new Gun();
                        break;
                    default:
                        System.out.println("Короче, Меченый, я тебя спас и в благородство играть не буду:\n" +
                                "Ты либо жми правильные кнопки, или дай поиграть другому");
                        continue;
                }
                break;
            } else {
                System.out.println("Просто берешь и жмешь или 1, или 2, или 3");
                sc.nextLine();
            }
        }


        Hero hero = new Hero(100, weapon, "Герой");

        for (int step = 0; step < 4; step++) {
            if (!hero.isAlive()) break;

            List<Room> shuffled = new ArrayList<>(roomPool);
            Collections.shuffle(shuffled);

            String right = RightDescriptions.getRandom();
            String left = LeftDescriptions.getRandom();
            String front = FrontDescriptions.getRandom();

            int choice;
            while (true) {
                System.out.println("\nКуда пойдёшь?");
                System.out.println("1. [справа] " + right);
                System.out.println("2. [слева]  " + left);
                System.out.println("3. [вперёд] " + front);

                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice >= 1 && choice <= 3) {
                        break; // валидный ввод — выходим
                    }
                }
                System.out.println("Неверный выбор! Введите 1, 2 или 3.");
                sc.nextLine();
            }

            Room selectedRoom = shuffled.get(choice - 1);
            selectedRoom.enter(hero, sc);
        }

        if (!hero.isAlive()) {
            System.out.println("Game over");
        } else {
            System.out.println("И у нас победитель! Вы выиграли аааааааааааааавторучку");
        }


    }
}