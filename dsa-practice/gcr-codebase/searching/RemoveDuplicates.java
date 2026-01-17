import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        // take input 
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        // take stringbuilder
        StringBuilder sb = new StringBuilder();
        // take hashset to keep track of character
        HashSet<Character> set = new HashSet<>();
        // iterate in string
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }
        }

        System.out.println("String without Duplicate :" + sb.toString());
    }
    
}
