import java.util.Scanner;

public class ElectionBooth {

    public static void main(String[] args) {
        // take input

        Scanner scanner = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.println("Enter voter age");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Check eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Vote for your candidate:");
                System.out.println("1 - Candidate A");
                System.out.println("2 - Candidate B");
                System.out.println("3 - Candidate C");

                int vote = scanner.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate A");
                } 
                else if (vote == 2) {
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate B");
                } 
                else if (vote == 3) {
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate C");
                } 
                else {
                    System.out.println("Invalid vote. Vote not counted.");
                }

            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        // Display final results
        System.out.println("Election Results");
        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        
    }
}
