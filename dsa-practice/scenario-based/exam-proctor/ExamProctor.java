import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
public class ExamProctor {
    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();
    public ExamProctor() {
        // Sample correct answers
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }
    // Track navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }
    // Store answer
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }
    // Evaluate score using function
    public int calculateScore() {
        int score = 0;
        for (Map.Entry<Integer, String> entry : correctAnswers.entrySet()) {
            int qId = entry.getKey();
            String correct = entry.getValue();
            String studentAnswer = answers.get(qId);
            if (correct.equalsIgnoreCase(studentAnswer)) {
                score++;
            }
        }
        return score;
    }
    // Show navigation history
    public void showNavigationHistory() {
        System.out.println("Navigation Stack : " + navigationStack);
    }
}
