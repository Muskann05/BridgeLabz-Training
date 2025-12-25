public class LineDistance {

    // Method to find Euclidean distance
    static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find slope and y-intercept
    static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1); // slope
        double b = y1 - (m * x1);                // y-intercept

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        int x1 = 2, y1 = 4;
        int x2 = 6, y2 = 8;

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);
    }
}

