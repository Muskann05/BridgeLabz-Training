import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights between 150 and 250
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights (in cms):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nShortest Height: " + findShortest(heights) + " cms");
        System.out.println("Tallest Height: " + findTallest(heights) + " cms");
        System.out.println("Mean Height: " + findMean(heights) + " cms");
    }
}
