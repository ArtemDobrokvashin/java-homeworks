package module7.middle3;

public class Middle3 {

    public static void main(String[] args) {
        Player player = new Player();
        int userChoice = player.choose();
        Game game = new Game(userChoice);
        game.start();
    }
}
