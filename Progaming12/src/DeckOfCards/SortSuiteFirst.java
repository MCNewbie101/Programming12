package DeckOfCards;

import java.util.Comparator;

public class SortSuiteFirst implements Comparator {
    /*
     * If the first input is larger, return 1.
     * If the inputs are the same, return 0.
     * If the second input is larger, return -1.
     */
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Card && o2 instanceof Card) {
            if (o1.equals(o2)) {
                return 0;
            }
            if (((Card) o1).getSuite() == ((Card) o2).getSuite()) {
                if (((Card) o1).getValue() < ((Card) o2).getValue()) {
                    return 1;
                }
                return -1;
            }
            if (((Card) o1).getSuite().ordinal() < ((Card) o2).getSuite().ordinal()) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
