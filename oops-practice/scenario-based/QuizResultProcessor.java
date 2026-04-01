import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

public class QuizResultProcessor {

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length)
            throw new InvalidQuizSubmissionException("Answer length mismatch");

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i]))
                score++;
        }
        return score;
    }

    static String getGrade(int score) {
        if (score >= 8) return "A";
        if (score >= 5) return "B";
        return "C";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] correct = {"A", "B", "C", "D"};
        String[] user = new String[4];

        System.out.println("Enter your answers:");
        for (int i = 0; i < 4; i++)
            user[i] = sc.next();

        try {
            int score = calculateScore(correct, user);
            System.out.println("Score: " + score);
            System.out.println("Grade: " + getGrade(score));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
