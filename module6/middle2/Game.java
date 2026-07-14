package middle2;

import java.util.Scanner;

import java.util.Random;


public class Game {
    private char[][] board;
    private int counterOfMoves;
    private Player playerHuman;
    private Player playerComputer;
    private Scanner scanner;
    private Random random;

    public Game(String humanName) {
        board = new char[3][3];
        counterOfMoves = 0;
        scanner = new Scanner(System.in);
        random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        playerHuman = new Player(humanName, 'X');
        playerComputer = new Player("Компьютер", 'O');
    }

    public void start() {
        System.out.println("Игра началась! Вы — " + playerHuman.getSymbol() + ", компьютер — " + playerComputer.getSymbol());

        while (true) {
            display();
            int humanMove = getPlayerMove();
            makeMove(playerHuman.getSymbol(), humanMove);

            if (checkWin(playerHuman.getSymbol())) {
                display();
                System.out.println("Поздравляем, " + playerHuman.getName() + "! Вы победили!");
                break;
            }

            if (isFull()) {
                display();
                System.out.println("Ничья!");
                break;
            }

            makeComputerMove();
            display();

            if (checkWin(playerComputer.getSymbol())) {
                System.out.println("Компьютер победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private int getPlayerMove() {
        while (true) {
            System.out.print("Ваш ход (1-9): ");
            int move = scanner.nextInt();
            if (isValidMove(move)) {
                return move;
            }
            System.out.println("Неверный ход! Клетка занята или номер вне диапазона.");
        }
    }

    private void makeComputerMove() {
        int winMove = findWinningMove(playerComputer.getSymbol());
        if (winMove != -1) {
            makeMove(playerComputer.getSymbol(), winMove);
            System.out.println("Компьютер походил в клетку " + winMove + " и выиграл!");
            return;
        }

        int blockMove = findWinningMove(playerHuman.getSymbol());
        if (blockMove != -1) {
            makeMove(playerComputer.getSymbol(), blockMove);
            System.out.println("Компьютер заблокировал вас — ход в клетку " + blockMove);
            return;
        }

        int move;
        do {
            move = random.nextInt(9) + 1;
        } while (!isValidMove(move));

        makeMove(playerComputer.getSymbol(), move);
        System.out.println("Компьютер походил в клетку " + move);
    }

    private void display() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }

    private boolean isValidMove(int cellNumber) {
        if (cellNumber < 1 || cellNumber > 9) return false;
        int index = cellNumber - 1;
        int row = index / 3;
        int col = index % 3;
        return board[row][col] == ' ';
    }

    private void makeMove(char symbol, int cellNumber) {
        int index = cellNumber - 1;
        int row = index / 3;
        int col = index % 3;
        board[row][col] = symbol;
        counterOfMoves++;
    }

    private boolean isFull() {
        return counterOfMoves == 9;
    }

    private boolean checkWin(char symbol) {
        // Строки
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol)
                return true;
        }
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol)
                return true;
        }
        // Диагонали
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;
        return false;
    }
    private int findWinningMove(char symbol) {
        for (int cell = 1; cell <= 9; cell++) {
            if (!isValidMove(cell)) continue;

            int index = cell - 1;
            int row = index / 3;
            int col = index % 3;
            char original = board[row][col];
            board[row][col] = symbol;

            boolean wins = checkWin(symbol);

            board[row][col] = original;

            if (wins) {
                return cell;
            }
        }
        return -1;
    }
}

