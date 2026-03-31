public class ExamApp {
    public static void main(String[] args) {
        ExamProctor exam = new ExamProctor();
        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");
        exam.visitQuestion(2);
        exam.submitAnswer(2, "B");
        exam.visitQuestion(3);
        exam.submitAnswer(3, "D"); 
        exam.visitQuestion(4);
        // wrong answer
        exam.submitAnswer(4, "D");
        exam.showNavigationHistory();
        int score = exam.calculateScore();
        System.out.println("Final Score: " + score + "/4");
    }
}
