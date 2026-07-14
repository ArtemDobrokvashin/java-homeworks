
public class Card {
    private final String suit;
    private final String rank;


    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getValue() {
        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            return 10;
        } else if (rank.equals("A")) {
            return 11;
        } else {
            return Integer.parseInt(rank); //Можно использовать valueOf(), т.к. у нас диапазон от 6 до 9.
        }
    }


    @Override
    public String toString() {
        return rank + suit;
    }
}
