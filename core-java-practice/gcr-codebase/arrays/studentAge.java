import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take input of array with age of students
        int[] studentAge=new int[10];
        System.out.println("Enter age");
        for(int i=0;i<studentAge.length;i++){
            studentAge[i]=sc.nextInt();
        }
        // iterates the array for condition
        for(int i=0;i<studentAge.length;i++){
            // check condition
            if(studentAge[i]>=18){
                System.out.println("The student with the age " + studentAge[i] + "can vote");
            }
            else if(studentAge[i]<18 && studentAge[i]>0){
                System.out.println("The student with the age" + studentAge[i] + "cannot vote");
            }
            else if(studentAge[i]<0){
                System.out.println("Invalid age");
            }
            
        }
    }
} 