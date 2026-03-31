import java.util.Scanner;

public class KeyGeneration {

    static String generate(String s){

        if(s.length()==0)
            return "Invalid Input (empty string)";

        if(s.length()<6)
            return "Invalid Input (length < 6)";

        for(char c:s.toCharArray()){
            if(Character.isDigit(c))
                return "Invalid Input (contains digits)";
            if(c==' ')
                return "Invalid Input (contains space)";
            if(!Character.isLetter(c))
                return "Invalid Input (contains special character)";
        }

        s=s.toLowerCase();

        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray())
            if((int)c%2!=0)
                sb.append(c);

        sb.reverse();

        for(int i=0;i<sb.length();i++)
            if(i%2==0)
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));

        return "The generated key is - "+sb.toString();
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++)
            System.out.println(generate(sc.nextLine()));
    }
}