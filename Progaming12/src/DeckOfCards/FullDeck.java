package DeckOfCards;

import java.util.ArrayList;

public class FullDeck extends Deck{
    public FullDeck() {
        super(52, new ArrayList<>());
    }

    public void generateDeck() {
        ArrayList<Card> tempCards = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            tempCards.add(new Card(Card.Suite.SPADES, i));
        }
        for (int i = 2; i <= 14; i++) {
            tempCards.add(new Card(Card.Suite.HEARTS, i));
        }
        for (int i = 2; i <= 14; i++) {
            tempCards.add(new Card(Card.Suite.CLUBS, i));
        }
        for (int i = 2; i <= 14; i++) {
            tempCards.add(new Card(Card.Suite.DIAMONDS, i));
        }
        this.setCards(tempCards);
    }
}
