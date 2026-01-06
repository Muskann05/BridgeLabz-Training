// Custom Exception
class InvalidScoreException extends Exception {
    InvalidScoreException(String message) {
        super(message);
    }
}

class StudentScore {

    static double calculateAverage(int[] scores) throws InvalidScoreException {
        int sum = 0;
        for (int score : scores) {
            validateScore(score);
            sum += score;
        }
        return (double) sum / scores.length;
    }

    static int findMax(int[] scores) throws InvalidScoreException {
        int max = scores[0];
        for (int score : scores) {
            validateScore(score);
            if (score > max)
                max = score;
        }
        return max;
    }

    static int findMin(int[] scores) throws InvalidScoreException {
        int min = scores[0];
        for (int score : scores) {
            validateScore(score);
            if (score < min)
                min = score;
        }
        return min;
    }

    static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100)
            throw new InvalidScoreException("Invalid score: " + score);
    }

    public static void main(String[] args) {
        int[] scores = {78, 85, 92, 67, 88};

        try {
            System.out.println("Average: " + calculateAverage(scores));
            System.out.println("Highest: " + findMax(scores));
            System.out.println("Lowest: " + findMin(scores));
        } catch (InvalidScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
