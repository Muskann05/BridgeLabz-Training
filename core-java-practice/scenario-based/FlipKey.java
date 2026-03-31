import java.util.*;
public class FlipKey{
    // method of cleanse and invert 
    public static String CleanseAndInvert(String input){
        // 1. condition to check if input is null or less than 6 character
        if(input == null || input.length()<6){
            return "";
        }
        // 2. check if input contains only letters or not 
        for(char ch : input.toCharArray()){
            if(!Character.isLetter(ch)){
                return "";
            }
        }
        // Password Generation

        // convert input to lowercase
        input = input.toLowerCase();

        // Remove character whose ASCII values are even numbers.
        String filtered = "";
        for(char ch : input.toCharArray()){
            if((int) ch % 2 != 0){
                filtered += ch;
            }
        }

        // Reverse Remaining characters
        String reversed ="";
        for(int i=filtered.length()-1; i>=0; i--){
            reversed += filtered.charAt(i);

        }
        // Convert characters even positioned index
        String result = "";
        for(int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if(i % 2 == 0) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        return result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // take input
        System.out.println("Enter input");
        String input = sc.nextLine();
        // call method of cleanse and invert
        String output = CleanseAndInvert(input);
        // check 
        if(output.equals("")){
            System.out.println("invalid input");
        }
        else{
            System.out.println("The generated key is - " + output);
        }
    }
}
