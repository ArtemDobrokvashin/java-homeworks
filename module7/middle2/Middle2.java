package module7.middle2;

public class Middle2 {
    public static void main(String[] args) {
        Player human = new Player();
        Game game = new Game(human, false, 0);
        game.start();
    }
}
