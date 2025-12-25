public class StudentScoreCard {

    // Generate random PCM marks
    static int[][] generateScores(int students) {
        int[][] pcm = new int[students][3];

        for (int i = 0; i < students; i++) {
            pcm[i][0] = (int)(Math.random() * 90) + 10; // Physics
            pcm[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            pcm[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return pcm;
    }

    // Calculate total, average and percentage
    static double[][] calculateResult(int[][] pcm) {
        double[][] result = new double[pcm.length][3];

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    // Display scorecard
    static void display(int[][] pcm, double[][] result) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println((i+1) + "\t" +
                    pcm[i][0] + "\t" +
                    pcm[i][1] + "\t" +
                    pcm[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2]);
        }
    }

    public static void main(String[] args) {

        int students = 5; // number of students
        int[][] pcmScores = generateScores(students);
        double[][] results = calculateResult(pcmScores);
        display(pcmScores, results);
    }
}
