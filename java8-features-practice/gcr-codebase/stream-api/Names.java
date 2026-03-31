import java.util.*;
public class Names{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "anita", "zoya", "mohan", "deepak");
        names.stream()
            .map(String::toUpperCase)   
            .sorted()                  
            .forEach(System.out::println);
    }
}
