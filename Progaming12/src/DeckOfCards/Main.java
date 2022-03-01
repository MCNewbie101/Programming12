package DeckOfCards;

public class Main {
    public static void main(String[] args) {
        FullDeck deck = new FullDeck();
        deck.generateDeck();
        deck.shuffleDeck();
        deck.print();
        deck.sortDeckSuiteFirst();
        deck.print();
        Deck hand = new Deck(5);
        deck.shuffleDeck();
        int handSize = hand.getSize();
        for (int i = 0; i < handSize; i++) {
            hand.addCard(deck.getCard(i));
        }
        hand.print();
        hand.removeCard(3);
        hand.print();
    }
}
