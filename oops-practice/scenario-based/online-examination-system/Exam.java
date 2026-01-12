import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examName;
    private List<Question> questions;
    private boolean timeExpired;

    public Exam(String examName) {
        this.examName = examName;
        this.questions = new ArrayList<>();
        this.timeExpired = false;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void expireTime() {
        timeExpired = true;
    }

    public void submit() throws ExamTimeExpiredException {
        if (timeExpired) {
            throw new ExamTimeExpiredException("Exam time expired!");
        }
        System.out.println("Exam submitted successfully.");
    }
}
