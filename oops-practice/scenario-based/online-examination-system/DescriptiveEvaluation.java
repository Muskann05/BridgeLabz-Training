import java.util.List;
public class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> questions, List<String> answers) {
        // Simple evaluation logic
        return answers.size() * 2; 
    }
}
