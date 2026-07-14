package middle4;

public class Player {
    private final String name;

    private int wins;

    public Player(String name, int wins) {
        this.name = name;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins(){
        this.wins++;
    }

}
