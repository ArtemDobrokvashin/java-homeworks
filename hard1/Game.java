import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public Game() {
        this.deck = new Deck();
        this.playerHand = new Hand(new ArrayList<>());
        this.dealerHand = new Hand(new ArrayList<>());
    }

    public void start() {
        // Раздача по 2 карты
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("Ваши карты: " + playerHand.getCards());
        System.out.println("Карта дилера: " + dealerHand.getCards().get(0));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Взять ещё карту? (y/n): ");
            String input = scanner.nextLine();

            if (input.equals("n")) {
                break;
            } else if (input.equals("y")) {
                playerHand.addCard(deck.dealCard());
                System.out.println("Ваши карты: " + playerHand.getCards());

                if (playerHand.getTotal() > 21) {
                    System.out.println("Перебор! Вы проиграли.");
                    return;
                }
            }
        }

        System.out.println("\nХод дилера:");
        while (dealerHand.getTotal() < 17) {
            dealerHand.addCard(deck.dealCard());
            System.out.println("Карты дилера: " + dealerHand.getCards());
        }

        int playerTotal = playerHand.getTotal();
        int dealerTotal = dealerHand.getTotal();

        System.out.println("\nВаша сумма: " + playerTotal);
        System.out.println("Сумма дилера: " + dealerTotal);

        if (dealerTotal > 21) {
            System.out.println("Дилер перебрал! Вы победили.");
        } else if (playerTotal > dealerTotal) {
            System.out.println("Вы победили!");
        } else if (playerTotal < dealerTotal) {
            System.out.println("Дилер победил.");
        } else {
            System.out.println("Ничья.");
        }
    }
}