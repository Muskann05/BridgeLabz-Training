public class MatrixManipulation {

    // Create random matrix
    static int[][] createMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10);
        return mat;
    }

    // Transpose of matrix
    static int[][] transpose(int[][] mat) {
        int[][] t = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                t[j][i] = mat[i][j];
        return t;
    }

    // Determinant of 2x2 matrix
    static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix
    static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] =  m[0][0] / (double)det;

        return inv;
    }

    // Inverse of 3x3 matrix
    static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return inv;
    }

    // Display matrix
    static void display(int[][] m) {
        for (int[] r : m) {
            for (int v : r)
                System.out.print(v + "\t");
            System.out.println();
        }
    }

    static void displayDouble(double[][] m) {
        for (double[] r : m) {
            for (double v : r)
                System.out.printf("%.2f\t", v);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat2 = createMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        display(mat2);
        System.out.println("Determinant = " + determinant2x2(mat2));
        System.out.println("Inverse:");
        displayDouble(inverse2x2(mat2));

        int[][] mat3 = createMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        display(mat3);
        System.out.println("Determinant = " + determinant3x3(mat3));
        System.out.println("Inverse:");
        displayDouble(inverse3x3(mat3));
    }
}
