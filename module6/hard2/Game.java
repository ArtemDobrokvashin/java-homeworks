package module6.hard2;

import java.util.Scanner;

public class Game {
    private module6.hard2.Field playerField;
    private module6.hard2.Field computerField;
    private Scanner scanner;

    public Game() {
        this.playerField = new module6.hard2.Field();
        this.computerField = new module6.hard2.Field();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Морской бой ===");

        setupPlayerShips();
        computerField.placeAllShips();

        System.out.println("\nНачинаем игру!\n");

        while (true) {
            playerTurn();
            if (computerField.isAllShipsSunk()) {
                System.out.println("Поздравляем! Вы победили!");
                break;
            }

            computerTurn();
            if (playerField.isAllShipsSunk()) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
    }

    private void setupPlayerShips() {
        System.out.println("Расставьте свои корабли:");
        placePlayerShip(4, "четырёхпалубный");
        for (int i = 0; i < 2; i++) {
            placePlayerShip(3, "трёхпалубный");
        }
        for (int i = 0; i < 3; i++) {
            placePlayerShip(2, "двухпалубный");
        }
        for (int i = 0; i < 4; i++) {
            placePlayerShip(1, "однопалубный");
        }
        System.out.println("Все корабли расставлены!\n");
        System.out.println("Ваше поле:");
        playerField.display(true);
        System.out.println();
    }

    private void placePlayerShip(int size, String name) {
        boolean placed;
        do {
            System.out.printf("Введите координаты для %s корабля:%n", name);
            System.out.print("Строка (0-9): ");
            int row = scanner.nextInt();
            System.out.print("Колонка (0-9): ");
            int col = scanner.nextInt();

            boolean isVertical = true; // значение по умолчанию
            if (size > 1) {
                System.out.print("Направление (v/h): ");
                String dir = scanner.next();
                isVertical = dir.equals("v");
            }

            placed = playerField.placeShip(size, row, col, isVertical);
            if (!placed) {
                System.out.println("Невозможно разместить корабль. Попробуйте снова.\n");
            } else {
                playerField.display(true);
                System.out.println();
            }
        } while (!placed);
    }

    private void playerTurn() {
        System.out.println("Ваш ход:");
        while (true) {
            System.out.print("Строка (0-9): ");
            int row = scanner.nextInt();
            System.out.print("Колонка (0-9): ");
            int col = scanner.nextInt();

            if (computerField.shoot(row, col)) {
                System.out.println("Попал!");
                System.out.println("\nВаше поле:");
                playerField.display(true);
                System.out.println("\nПоле компьютера:");
                computerField.display(false);
                if (computerField.isAllShipsSunk()) break;
            } else {
                System.out.println("Мимо!");
                System.out.println("\nВаше поле:");
                playerField.display(true);
                System.out.println("\nПоле компьютера:");
                computerField.display(false);
                break;
            }
        }
    }

    private void computerTurn() {
        System.out.println("\nХод компьютера:");
        while (true) {
            int row = (int) (Math.random() * 10);
            int col = (int) (Math.random() * 10);

            int[][] compView = playerField.getField();
            if (compView[row][col] == 0 || compView[row][col] == 1) {
                boolean hit = playerField.shoot(row, col);
                System.out.printf("Компьютер стреляет в [%d][%d]: ", row, col);
                if (hit) {
                    System.out.println("Попал!");
                    if (playerField.isAllShipsSunk()) break;
                } else {
                    System.out.println("Мимо!");
                    break;
                }
            }
        }
        System.out.println("\nВаше поле:");
        playerField.display(true);
        System.out.println();
    }
}