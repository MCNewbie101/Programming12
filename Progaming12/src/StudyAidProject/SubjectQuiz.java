package StudyAidProject;

public class SubjectQuiz extends Quiz{
    private String subject;
    private CardList questionPool = new CardList();

    public SubjectQuiz(int maxScore, String subject) {
        super(maxScore);
        this.subject = subject.toLowerCase();
    }

    @Override
    public void generateQuiz(CardList cardList) {
        for (FlashCard card : cardList.getCards()) {
            if (card.getSubject().equals(this.subject)) {
                questionPool.addCard(card);
            }
        }
        System.out.println(questionPool.getSize());
        if (questionPool.getSize() < this.getMaxScore()) {
            System.out.println("Not enough flashcards!");
        } else {
            for (int i = 0; i < this.getMaxScore(); i++) {
                FlashCard newCard = questionPool.getRandomCard();
                this.questions.addCard(newCard);
                questionPool.removeCard(newCard);
            }
        }
    }
}
