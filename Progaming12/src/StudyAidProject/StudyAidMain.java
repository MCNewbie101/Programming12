package StudyAidProject;

public class StudyAidMain {
    public static void main(String[] args) {
        CardList questionSet1 = new CardList();
        FlashCard card1 = new FlashCard ("1 + 1 =", "2", "Math");
        FlashCard card2 = new FlashCard ("x + y = 7, x * y = 12, x < y. x =", "3", "Math");
        FlashCard card3 = new FlashCard ("Name the following sequence: 1, 1, 2, 3, 5, 8, 13", "Fibonacci number", "Math");
        FlashCard card4 = new FlashCard ("Unscramble the following word: esecaehkce", "cheesecake", "English");
        questionSet1.addCard(card1);
        questionSet1.addCard(card2);
        questionSet1.addCard(card2);
        questionSet1.addCard(card3);
        questionSet1.addCard(card4);
        questionSet1.addCard(card1);
        Quiz quiz1 = new Quiz(5);
        quiz1.generateQuiz(questionSet1);
        Quiz quiz2 = new Quiz(4);
        quiz2.generateQuiz(questionSet1);
        quiz2.startQuiz();
        SubjectQuiz quiz3 = new SubjectQuiz(3, "math");
        quiz3.generateQuiz(questionSet1);
        quiz3.startQuiz();
    }
}
