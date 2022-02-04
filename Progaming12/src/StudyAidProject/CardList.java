package StudyAidProject;

import java.util.ArrayList;
import java.util.Scanner;

public class CardList {
    private ArrayList<FlashCard> cards;

    public CardList() {
        cards = new ArrayList<>();
    }

    public CardList(ArrayList<FlashCard> cards) {
        this.cards = cards;
    }

    public ArrayList<FlashCard> getCards() {
        return cards;
    }

    public void addCard(FlashCard card) {
        if (cards.contains(card)) {
            System.out.println("This flashcard is already added!");
            return;
        }
        cards.add(card);
    }

    public void addCards(ArrayList<FlashCard> cards) {
        this.cards.addAll(cards);
    }

    public FlashCard getRandomCard() {
        int cardN = (int) (Math.random() * (cards.size() - 1));
        return cards.get(cardN);
//        return cards.get((int) (Math.random() * (cards.size() - 1)));
    }

    public FlashCard getCard(int card) {
        return cards.get(card);
    }

    public int getSize() {
        return cards.size();
    }

    public boolean contains(FlashCard newCard) {
        for (FlashCard card : cards) {
            if (card.getQuestion().equals(newCard.getQuestion())) {
                return true;
            }
        }
        return false;
    }

    public void removeCard(FlashCard removeCard) {
        cards.removeIf(card -> card.getQuestion().equals(removeCard.getQuestion()));
    }

    public void makeCardList() {
        System.out.println("How many questions?");
        Scanner scanner = new Scanner(System.in);
        int questionNum = scanner.nextInt();
        int i = 0;
        while (i < questionNum) {
            System.out.println("Input the next question.");
            String question = scanner.nextLine();
            System.out.println("Input the answer.");
            String answer = scanner.nextLine();
            System.out.println("What subject is this question?");
            String subject = scanner.nextLine();
            FlashCard flashCard = new FlashCard(question, answer, subject);
            if (!contains(flashCard)) {
                addCard(flashCard);
                i++;
            } else {
                System.out.println("This flashcard is already added!");
            }
        }
    }
}
