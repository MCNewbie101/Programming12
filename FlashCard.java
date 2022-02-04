package StudyAidProject;

public class FlashCard {
    private String question;
    private String answer;
    private String subject;

    public FlashCard(String question, String answer, String subject) {
        this.question = question;
        this.answer = answer.toLowerCase();
        this.subject = subject.toLowerCase();
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getSubject() {
        return subject;
    }

    public void ask() {
        System.out.println(question);
    }

    public boolean isCorrect(String answer) {
        answer = answer.toLowerCase();
        return answer.equals(this.answer);
    }
}
