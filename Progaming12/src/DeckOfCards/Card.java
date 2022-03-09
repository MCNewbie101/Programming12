package DeckOfCards;

/*
 * Sets up a card.
 */

public class Card {
    enum Suite {
        SPADES, HEARTS, CLUBS, DIAMONDS
    }
    enum Face {
        NONE, JACK, QUEEN, KING, ACE;
    }

    private Suite suite;
    private Face face;
    private int value;

    public Card(Suite suite, int value) {
        this.suite = suite;
        this.value = value;
        if (value <= 10) {
            this.face = Face.NONE;
        }
        if (value == 11) {
            this.face = Face.JACK;
        }
        if (value == 12) {
            this.face = Face.QUEEN;
        }
        if (value == 13) {
            this.face = Face.KING;
        }
        if (value == 14) {
            this.face = Face.ACE;
        }
    }

    public Suite getSuite() {
        return suite;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object card) {
        if (card instanceof Card) {
            return ((Card) card).suite == this.suite && ((Card) card).value == this.value;
        }
        return false;
    }

    @Override
    public String toString() {
        if (face == Face.NONE) {
            return value + " of " + suite;
        }
        return face + " of " + suite;
    }
}