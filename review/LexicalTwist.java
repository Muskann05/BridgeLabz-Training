import java.util.*;
public class LexicalTwist{
    // check character is vowel 
    public static boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();
        // check if word is an invalid word
        if(word1.contains(" ")){
            System.out.println(word1 + " is an invalid word");
            return;
        }
        if(word2.contains(" ")){
            System.out.println(word2 + "is an invalid word");
        }
        // check if second word is reversed or not
        String reversedWord1 = new StringBuilder(word1).reverse().toString();
        if(reversedWord1.equalsIgnoreCase(word2)){
            // Case 1: Both Words are reverse of each other
            String result = reversedWord1.toLowerCase();
            result = result.replaceAll("[aeiou]", "@");
            System.out.println(result);
        } else{
            // Case 2: Words are NOT reverse
            String combined = (word1 + word2).toUpperCase();
            int vowelCount = 0;
            int consonantCount = 0;
            for(char ch : combined.toCharArray()){
                if(Character.isLetter(ch)){
                    if(isVowel(ch)){
                        vowelCount++;
                    } else{
                        consonantCount++;
                    }
                }
            }
            if (vowelCount > consonantCount){
                HashSet<Character> vowels = new HashSet<>();
                for(char ch : combined.toCharArray()){
                    if (isVowel(ch)){
                        vowels.add(ch);
                        if (vowels.size() == 2)
                            break;
                    }
                }
                for(char ch : vowels){
                    System.out.print(ch);
                }

            } else if(consonantCount > vowelCount){
                HashSet<Character> consonants = new HashSet<>();
                for(char ch : combined.toCharArray()) {
                    if(Character.isLetter(ch) && !isVowel(ch)){
                        consonants.add(ch);
                        if(consonants.size() == 2)
                            break;
                    }
                }
                for(char ch:consonants){
                    System.out.print(ch);
                }
            } else{
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
