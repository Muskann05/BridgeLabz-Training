import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        // take input
    Scanner sc = new Scanner(System.in);
    // input number of students
    System.out.println("Enter number of students");
    int number = sc.nextInt();
    // take array of marks
    System.out.println("Enter Marks");
    int[] marks = new int[number];
    // input marks 
    for(int i = 0; i<number; i++){
        marks[i] = sc.nextInt();
    }
    // Bubble sort 
    for(int i = 0; i <number-1; i++){
        for(int j = i+1; j< number; j++){
            if(marks[i] > marks[j]){
                int temp = marks[i];
                marks[i] = marks[j];
                marks[j] = temp;
            }
        }
    }
    System.out.println("Sorted student marks (Ascending):");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
