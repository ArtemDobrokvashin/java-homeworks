package module7.hard2;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Игрок 1, сделайте свой выбор:");
        int choice1 = player1.choose();
        Things card1 = Things.fromGame(choice1);

        System.out.println("Игрок 2, сделайте свой выбор:");
        int choice2 = player2.choose();
        Things card2 = Things.fromGame(choice2);

        if (card1 == card2) {
            System.out.println("Ничья! Оба выбрали " + card1);
        } else if (
                (card1 == Things.КАМЕНЬ && card2 == Things.НОЖНИЦЫ) ||
                        (card1 == Things.НОЖНИЦЫ && (card2 == Things.БУМАГА || card2 == Things.КОЛОДЕЦ)) ||
                        (card1 == Things.БУМАГА && (card2 == Things.КАМЕНЬ || card2 == Things.КОЛОДЕЦ)) ||
                        (card1 == Things.КОЛОДЕЦ && (card2 == Things.КАМЕНЬ || card2 == Things.НОЖНИЦЫ))
        ) {
            player1.incrementScore();
            System.out.println("Победил Игрок 1! Выбор: " + card1 + " vs " + card2);
        } else {
            player2.incrementScore();
            System.out.println("Победил Игрок 2! Выбор: " + card1 + " vs " + card2);
        }

        // Показываем счёт после раунда
        System.out.println("Счёт — Игрок 1: " + player1.getScore() + ", Игрок 2: " + player2.getScore());
    }
}