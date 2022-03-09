package DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Sets up a deck or a hand.
 */

public class Deck {
    private int cardNum;
    private ArrayList<Card> cards;

    public Deck(int cardNum) {
        this.cardNum = cardNum;
        this.cards = new ArrayList<>();
    }

    public Deck(int cardNum, ArrayList<Card> cards) {
        this.cardNum = cardNum;
        this.cards = cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
        cardNum++;
    }

    public Card getCard(int num) {
        return this.cards.get(num);
    }

    public void removeCard(int num) {
        this.cards.remove(num);
        cardNum--;
    }

    public int getSize() {
        return cardNum;
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card.toString());
        }
    }

    /*
     * Sort by suite first, then by the largest value first
     */
    public void sortDeckSuiteFirst() {
        SortSuiteFirst sorter = new SortSuiteFirst();
        Collections.sort(this.cards, sorter);
    }
}
