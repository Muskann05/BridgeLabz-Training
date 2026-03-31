import java.util.Scanner;

class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // call method

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}

