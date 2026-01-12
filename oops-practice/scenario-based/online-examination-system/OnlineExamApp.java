import java.util.ArrayList;
import java.util.List;

public class OnlineExamApp {

    public static void main(String[] args) {

        Student student = new Student(1, "Rohan");

        Exam exam = new Exam("Java Test");
        exam.addQuestion(new Question("What is JVM?", "Virtual Machine"));
        exam.addQuestion(new Question("What is OOP?", "Object Oriented Programming"));

        List<String> answers = new ArrayList<>();
        answers.add("Virtual Machine");
        answers.add("Object Oriented Programming");

        EvaluationStrategy evaluator = new ObjectiveEvaluation(); // Polymorphism

        try {
            exam.submit();
            int score = evaluator.evaluate(exam.getQuestions(), answers);
            System.out.println("Student: " + student.getName());
            System.out.println("Score: " + score);
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}
