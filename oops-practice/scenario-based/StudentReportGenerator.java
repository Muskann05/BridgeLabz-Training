import java.util.*;

class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentReportGenerator {

    static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks)
            sum += m;
        return sum / (double) marks.length;
    }

    static String getGrade(double avg) {
        if (avg >= 80) return "A";
        if (avg >= 60) return "B";
        return "C";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter mark " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] < 0 || marks[i] > 100)
                    throw new InvalidMarkException("Marks must be between 0 and 100");
            }

            Student s = new Student(name, marks);
            double avg = calculateAverage(s.marks);

            System.out.println("Average: " + avg);
            System.out.println("Grade: " + getGrade(avg));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
