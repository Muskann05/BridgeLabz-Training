import java.io.*;
import java.util.*;
public class DetectDuplicates {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\data-handling\\duplicates-csv\\students.csv"));
            Set<String> seen = new HashSet<>();
            String line = br.readLine(); 
            while((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if(seen.contains(d[0])) {
                    System.out.println("Duplicate: " + line);
                } else {
                    seen.add(d[0]);
                }
            }
            br.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
