package StudyAidProject;

import java.util.Scanner;

public class Quiz {
    private int score = 0;
    private int maxScore;
    CardList questions = new CardList();
    private CardList questionPool;

    public Quiz (int maxScore) {
        this.maxScore = maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public CardList getQuestions() {
        return questions;
    }

    public void generateQuiz(CardList cardList) {
        if (maxScore > cardList.getSize()) {
            System.out.println("Not enough flashcards!");
        } else {
            questionPool = cardList;
            for (int i = 0; i < maxScore; i++) {
                FlashCard newCard = questionPool.getRandomCard();
                questions.addCard(newCard);
                questionPool.removeCard(newCard);
            }
        }
    }

    public void startQuiz() {
        for (FlashCard card : questions.getCards()) {
            card.ask();
            Scanner scanner = new Scanner(System.in);
            boolean correct = card.isCorrect(scanner.nextLine());
            if (correct){
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The right answer is: " + card.getAnswer());
            }
        }
        System.out.println("You got: " + score + " out of " + maxScore);
    }
}
