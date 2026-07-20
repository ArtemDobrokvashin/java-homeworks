package module7.hard2;

public class Hard2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Game game = new Game(player1, player2); // ← передаём игроков
        game.start(); // ← игра сама запросит выбор у каждого
    }
}