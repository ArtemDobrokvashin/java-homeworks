package module6.hard2;

import java.util.Random;

public class Field {
    private int[][] field;

    public Field() {
        this.field = new int[10][10];
    }

    public int[][] getField() {
        return field;
    }

    public boolean placeShip(int size, int row, int col, boolean isVertical) {
        // Проверка границ
        if (isVertical) {
            if (row + size > 10) return false;
        } else {
            if (col + size > 10) return false;
        }

        for (int i = 0; i < size; i++) {
            int r = isVertical ? row + i : row;
            int c = isVertical ? col : col + i;
            if (field[r][c] != 0) {
                return false;
            }
        }

        for (int i = 0; i < size; i++) {
            int r = isVertical ? row + i : row;
            int c = isVertical ? col : col + i;
            field[r][c] = 1;
        }
        return true;
    }

    public void placeAllShips() {
        Random random = new Random();

        placeShipRandomly(4, random);

        for (int i = 0; i < 2; i++) {
            placeShipRandomly(3, random);
        }

        for (int i = 0; i < 3; i++) {
            placeShipRandomly(2, random);
        }

        for (int i = 0; i < 4; i++) {
            placeShipRandomly(1, random);
        }
    }

    private void placeShipRandomly(int size, Random random) {
        boolean placed;
        do {
            int row = random.nextInt(10);
            int col = random.nextInt(10);
            boolean isVertical = random.nextBoolean();
            placed = placeShip(size, row, col, isVertical);
        } while (!placed);
    }

    public boolean shoot(int row, int col) {
        if (row < 0 || row >= 10 || col < 0 || col >= 10) {
            return false; // недопустимые координаты
        }
        if (field[row][col] == 1) {
            field[row][col] = 2; // подбито
            return true;
        }
        return false; // мимо или уже стреляли
    }

    public boolean isAllShipsSunk() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void display(boolean showShips) {
        System.out.print("  ");
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " "); // номер строки
            for (int j = 0; j < 10; j++) {
                int cell = field[i][j];
                if (cell == 2) {
                    System.out.print("X "); // подбито
                } else if (cell == 1 && showShips) {
                    System.out.print("■ "); // корабль (только если разрешено)
                } else {
                    System.out.print("~ "); // пусто или скрытый корабль
                }
            }
            System.out.println();
        }
    }
}