import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();


    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getTotal() {
        int sum = 0;
        int aces = 0;

        for (Card card : cards) {
            sum += card.getValue();
            if (card.getRank().equals("A")) {
                aces++;
            }
        }
        while (sum > 21 && aces == 0){
            sum -= 10;
            aces--;
        }
        return sum;
    }
}
