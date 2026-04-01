public class MatrixOperations {

    // Create random matrix
    static int[][] createMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = (int)(Math.random() * 10); // 0–9
            }
        }
        return mat;
    }

    // Add two matrices
    static int[][] addMatrix(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    // Subtract two matrices
    static int[][] subtractMatrix(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    // Multiply two matrices
    static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Display matrix
    static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 2, cols = 2;

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrix(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrix(A, B));
    }
}
