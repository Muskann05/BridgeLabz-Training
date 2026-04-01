class EduQuiz {

    static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(student[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        return score;
    }

    public static void main(String[] args) {

        String[] correctAnswers = {
            "A","B","C","D","A","B","C","D","A","B"
        };

        String[] studentAnswers = {
            "A","b","C","A","A","B","d","D","A","C"
        };

        int score = calculateScore(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;

        System.out.println("\nScore: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result: PASS ");
        } else {
            System.out.println("Result: FAIL ");
        }
    }
}
